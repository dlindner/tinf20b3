package de.dhbw.tinf20b3.patterns.decorator;

public abstract class Dekorierer implements VisuelleKomponente {
	
	private final VisuelleKomponente nachfolger;
	
	public Dekorierer(VisuelleKomponente nachfolger) {
		super();
		this.nachfolger = nachfolger;
	}
	
	@Override
	public void zeichne() {
		this.nachfolger.zeichne();
	}
}
