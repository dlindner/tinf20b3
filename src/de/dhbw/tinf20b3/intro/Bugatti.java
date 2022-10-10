package de.dhbw.tinf20b3.intro;

public class Bugatti extends Sportwagen {
	
	public Bugatti() {
		super("Chiron");
	}
	
	@Override
	public void flitze() {
		System.out.println("S3: Ich bin ein " + bezeichnung() + ", Baby!");
	}
}
