package de.dhbw.tinf20b3.intro;

import java.io.Closeable;

public class Porsche extends Sportwagen implements Auto, Closeable {
	
	public Porsche() {
		super("911");
	}
	
	@Override
	public void flitze() {
		System.out.println("S2: Bleib in der Spur, bleib in der Spur!");
	}
		
	@Override
	public PorscheReparaturtermin repariereMich() {
		return new PorscheReparaturtermin(this);
	}
}
