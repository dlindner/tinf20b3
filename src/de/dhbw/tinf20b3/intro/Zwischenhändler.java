package de.dhbw.tinf20b3.intro;

/**
 * Das hier ist der Adapter,
 * auch Sportwagenrapper genannt
 */
public class Zwischenh�ndler implements Autoh�ndler {
	
	private Sportwagendealer dealer;

	public Zwischenh�ndler(Sportwagendealer dealer) {
		super();
		this.dealer = dealer;
	}
	
	@Override
	public Auto premiumangebot() {
		return this.dealer.premiumangebot();
	}
	
	@Override
	public Auto sonderangebot() {
		return this.dealer.sonderangebot();
	}
}
