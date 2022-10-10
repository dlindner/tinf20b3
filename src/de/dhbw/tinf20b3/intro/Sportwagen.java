package de.dhbw.tinf20b3.intro;

public abstract class Sportwagen {
	
	private String bezeichnung;

	public Sportwagen(String bezeichnung) {
		super();
		this.bezeichnung = bezeichnung;
	}
	
	public void flitze() {
		System.out.println("S1: Whooosh!");
	}
	
	protected String bezeichnung() {
		return bezeichnung;
	}
}
