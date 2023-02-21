package de.dhbw.tinf20b3.patterns.observer;

public class GuterBeobachter implements Beobachter {
	
	public GuterBeobachter() {
		super();
	}
	
	@Override
	public void aktualisiere() {
		System.out.println("Ich sehe genau die Änderung");
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}
