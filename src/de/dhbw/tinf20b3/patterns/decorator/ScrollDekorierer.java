package de.dhbw.tinf20b3.patterns.decorator;

public class ScrollDekorierer extends Dekorierer {
	
	public ScrollDekorierer(VisuelleKomponente nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void zeichne() {
		super.zeichne();
		System.out.println("[-<|>--]");
	}

}
