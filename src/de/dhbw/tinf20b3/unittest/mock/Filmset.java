package de.dhbw.tinf20b3.unittest.mock;

public class Filmset {

	private Filmstar hauptdarsteller;

	public Filmset(Filmstar hauptdarsteller) {
		super();
		this.hauptdarsteller = hauptdarsteller;
	}
	
	public String dreheSzene() {
		if (
			!this.hauptdarsteller.werdeAusgeleuchtet()
		) {
			return "";
		}
		return this.hauptdarsteller.sageSignatureLine();
	}
}
