package de.dhbw.tinf20b3.patterns.observer;

public class BöserBeobachter implements Beobachter {
	
	public BöserBeobachter() {
		super();
	}
	
	@Override
	public void aktualisiere() {
		System.err.println("Ich bin böse!");
		((Object) null).toString();
	}
}
