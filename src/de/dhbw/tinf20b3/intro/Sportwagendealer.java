package de.dhbw.tinf20b3.intro;

/*
 * NICHT VER�NDERBAR!
 */
public class Sportwagendealer {

	public Sportwagendealer() {
		super();
	}
	
	public Sportwagen sonderangebot() {
		return new Porsche();
	}
	
	public Sportwagen premiumangebot() {
		return new Bugatti();
	}
}
