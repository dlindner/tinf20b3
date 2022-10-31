package de.dhbw.tinf20b3.clean.architecture;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class Outbox {

	private final BlockingQueue<SMS> warteschlange;
	private final List<SMSSender> verfügbareSender;
	private final Object verfügbareSenderSemaphor;
	
	public Outbox() {
		super();
		this.warteschlange = new LinkedBlockingQueue<>();
		this.verfügbareSender = new LinkedList<>();
		this.verfügbareSenderSemaphor = new Object();
	}
	
	public void versendeBaldmöglichst(SMS nachricht) {
		try {
			System.out.println("Füge ein: " + nachricht);
			this.warteschlange.put(nachricht);
		} catch (InterruptedException e) {
			System.err.println("Wir wurden unterbrochen!");
			Thread.currentThread().interrupt();
		}
	}
	
	public void start() {
		final ExecutorService hintergrund = Executors.newSingleThreadExecutor();
		hintergrund.execute(() -> {
			while (true) {
				versandschritt();
				Thread.yield();
			}
		});
		hintergrund.shutdown();
	}
	
	private void versandschritt() {
		System.out.println("versandschritt");
		try {
			final SMS nächste = this.warteschlange.take();
			System.out.println("I took " + nächste);
			Optional<SMSSender> maybeSender = Optional.empty();
			while (maybeSender.isEmpty()) {
				Thread.yield();
				synchronized (this.verfügbareSenderSemaphor) {
					maybeSender = this.verfügbareSender.stream().findAny();
				}
			}
			SMSSender sender = maybeSender.get();
			sender.versende(nächste);
		} catch (InterruptedException e) {
			System.err.println("Wir wurden unterbrochen!");
			Thread.currentThread().interrupt();
		}
	}
	
	public void meldeVerfügbar(SMSSender sender) {
		synchronized (this.verfügbareSenderSemaphor) {
			System.out.println("Melde verfügbar: " + sender);
			this.verfügbareSender.add(sender);
		}
	}

	public void meldeAb(SMSSender unserSender) {
		synchronized (this.verfügbareSenderSemaphor) {
			this.verfügbareSender.remove(unserSender);
			System.out.println("Hat sich abgemeldet: " + unserSender);
		}
	}
}
