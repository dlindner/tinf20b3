package de.dhbw.tinf20b3.patterns.decorator;

public class LeerzeileNachherDekorierer extends Dekorierer {

	public LeerzeileNachherDekorierer(
		VisuelleKomponente nachfolger
	) {
		super(nachfolger);
	}
	
	@Override
	public void zeichne() {
		super.zeichne();
		System.out.println();
	}
}
