package de.dhbw.tinf20b3.intro;

public class Autoh�ndler {

	public Autoh�ndler() {
		super();
	}
	
	public Sportwagen sonderangebot() {
		return new Porsche();
	}
	
	public Sportwagen premiumangebot() {
		return new Bugatti();
	}
}
