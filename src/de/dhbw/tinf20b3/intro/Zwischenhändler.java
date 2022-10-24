package de.dhbw.tinf20b3.intro;

/**
 * Das hier ist der Adapter,
 * auch Sportwagenrapper genannt
 */
public class Zwischenhändler implements Autohändler {
	
	private Sportwagendealer dealer;

	public Zwischenhändler(Sportwagendealer dealer) {
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
