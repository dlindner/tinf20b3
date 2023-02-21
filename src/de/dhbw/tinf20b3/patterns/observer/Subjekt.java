package de.dhbw.tinf20b3.patterns.observer;

import java.util.LinkedList;
import java.util.List;

public class Subjekt {

	private final List<Beobachter> angemeldet;
	
	public Subjekt() {
		super();
		this.angemeldet = new LinkedList<>();
	}
	
	public void benachrichtige() {
		//synchronized (this.angemeldet) {
			for (Beobachter each : angemeldet) {
//				try {
					each.aktualisiere();
//				} catch (Exception e) {
//					System.err.println("Fing Exception: " + e.getClass().getSimpleName());
//				}
			}
		//}
	}
	
	public void meldeAn(Beobachter b) {
		synchronized (this.angemeldet) {
			this.angemeldet.add(b);
		}
	}
	
	public void meldeAb(Beobachter b) {
		synchronized (this.angemeldet) {
			this.angemeldet.remove(b);
		}
	}
}
