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
	private final List<SMSSender> verf�gbareSender;
	private final Object verf�gbareSenderSemaphor;
	
	public Outbox() {
		super();
		this.warteschlange = new LinkedBlockingQueue<>();
		this.verf�gbareSender = new LinkedList<>();
		this.verf�gbareSenderSemaphor = new Object();
	}
	
	public void versendeBaldm�glichst(SMS nachricht) {
		try {
			System.out.println("F�ge ein: " + nachricht);
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
			final SMS n�chste = this.warteschlange.take();
			System.out.println("I took " + n�chste);
			Optional<SMSSender> maybeSender = Optional.empty();
			while (maybeSender.isEmpty()) {
				Thread.yield();
				synchronized (this.verf�gbareSenderSemaphor) {
					maybeSender = this.verf�gbareSender.stream().findAny();
				}
			}
			SMSSender sender = maybeSender.get();
			sender.versende(n�chste);
		} catch (InterruptedException e) {
			System.err.println("Wir wurden unterbrochen!");
			Thread.currentThread().interrupt();
		}
	}
	
	public void meldeVerf�gbar(SMSSender sender) {
		synchronized (this.verf�gbareSenderSemaphor) {
			System.out.println("Melde verf�gbar: " + sender);
			this.verf�gbareSender.add(sender);
		}
	}

	public void meldeAb(SMSSender unserSender) {
		synchronized (this.verf�gbareSenderSemaphor) {
			this.verf�gbareSender.remove(unserSender);
			System.out.println("Hat sich abgemeldet: " + unserSender);
		}
	}
}
