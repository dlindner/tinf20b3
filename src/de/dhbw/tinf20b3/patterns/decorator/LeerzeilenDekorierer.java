package de.dhbw.tinf20b3.patterns.decorator;

public class LeerzeilenDekorierer extends Dekorierer {
	
	private boolean vorher;
	private boolean nachher;

	public LeerzeilenDekorierer(
		VisuelleKomponente nachfolger,
		boolean vorher,
		boolean nachher
	) {
		super(nachfolger);
		this.vorher = vorher;
		this.nachher = nachher;
	}
	
	@Override
	public void zeichne() {
		leerzeileVorher();
		super.zeichne();
		leerzeileNachher();
	}

	private void leerzeileVorher() {
		if (this.vorher) {
			System.out.println();
		}
	}
	
	private void leerzeileNachher() {
		if (this.nachher) {
			System.out.println();
		}
	}
}
