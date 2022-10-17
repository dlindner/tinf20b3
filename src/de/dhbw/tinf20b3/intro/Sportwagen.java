package de.dhbw.tinf20b3.intro;

public abstract class Sportwagen {
	
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
	
	public void flitze() {
		System.out.println(this);
		System.out.println(Sportwagen.class);
		System.out.println(getClass());
		System.out.println("S1: Whooosh!");
	}
	
	protected String bezeichnung() {
		return bezeichnung;
	}
	
	public Reparaturtermin repariereMich() {
		return new Reparaturtermin(this);
	}
}
