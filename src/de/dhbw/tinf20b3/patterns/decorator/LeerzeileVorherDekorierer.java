package de.dhbw.tinf20b3.patterns.decorator;

public class LeerzeileVorherDekorierer extends Dekorierer {

	public LeerzeileVorherDekorierer(
		VisuelleKomponente nachfolger
	) {
		super(nachfolger);
	}
	
	@Override
	public void zeichne() {
		System.out.println();
		super.zeichne();
	}
}
