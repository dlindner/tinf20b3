package de.dhbw.tinf20b3.patterns.observer;

public class B�serBeobachter implements Beobachter {
	
	public B�serBeobachter() {
		super();
	}
	
	@Override
	public void aktualisiere() {
		System.err.println("Ich bin b�se!");
		((Object) null).toString();
	}
}
