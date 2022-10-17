package de.dhbw.tinf20b3.intro;

public class PorscheReparaturtermin extends Reparaturtermin {

	private Porsche porsche;

	public PorscheReparaturtermin(Porsche porsche) {
		super(porsche);
		this.porsche = porsche;
	}
}
