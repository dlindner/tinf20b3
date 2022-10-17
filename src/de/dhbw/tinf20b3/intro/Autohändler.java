package de.dhbw.tinf20b3.intro;

public class Autohändler {

	public Autohändler() {
		super();
	}
	
	public Sportwagen sonderangebot() {
		return new Porsche();
	}
	
	public Sportwagen premiumangebot() {
		return new Bugatti();
	}
}
