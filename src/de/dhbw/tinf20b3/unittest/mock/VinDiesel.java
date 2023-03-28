package de.dhbw.tinf20b3.unittest.mock;

public class VinDiesel implements Filmstar {
	
	public VinDiesel() {
		super();
	}
	
	@Override
	public boolean werdeAusgeleuchtet() {
		return false;
	}
	
	@Override
	public String sageSignatureLine() {
		return "Nothing is stronger than family";
	}
}
