package de.dhbw.tinf20b3.patterns.decorator;

public class RahmenDekorierer extends Dekorierer {
	
	public RahmenDekorierer(VisuelleKomponente nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void zeichne() {
		System.out.println("[[");
		super.zeichne();
		System.out.println("]]");
	}
}
