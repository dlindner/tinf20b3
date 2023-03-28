package de.dhbw.tinf20b3.unittest.mock;

public class KeanuReeves implements Filmstar {
	
	public KeanuReeves() {
		super();
	}
	
	@Override
	public boolean werdeAusgeleuchtet() {
		return true;
	}
	
	@Override
	public String sageSignatureLine() {
		return "you are breathtaking";
	}
}
