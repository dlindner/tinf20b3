package de.dhbw.tinf20b3.intro;

import java.io.IOException;

public abstract class Sportwagen implements Auto {
	
	private String bezeichnung;

	public Sportwagen(String bezeichnung) {
		super();
		this.bezeichnung = bezeichnung;
	}
	
	public static void woBinIch() {
		System.out.println("Hier!");
//		System.out.println(this);
		System.out.println(Sportwagen.class);
//		System.out.println(getClass());
	}

	public void close() throws IOException {
		System.out.println("Ich bin jetzt verschlossen!");
	}

	
//	public void flitze() {
//		System.out.println(this);
//		System.out.println(Sportwagen.class);
//		System.out.println(getClass());
//		System.out.println("S1: Whooosh!");
//	}
	
	@Override
	public abstract void flitze();
	
	protected String bezeichnung() {
		return bezeichnung;
	}
	
	@Override
	public Reparaturtermin repariereMich() {
		return new Reparaturtermin(this);
	}
}
