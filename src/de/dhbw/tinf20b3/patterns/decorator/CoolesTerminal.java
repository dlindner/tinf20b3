package de.dhbw.tinf20b3.patterns.decorator;

public class CoolesTerminal implements VisuelleKomponente {
	
	@Override
	public void zeichne() {
		System.out.println("COOL!");
	}
}
