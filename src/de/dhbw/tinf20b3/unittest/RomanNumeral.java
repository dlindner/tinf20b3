package de.dhbw.tinf20b3.unittest;

public class RomanNumeral {
	
	public RomanNumeral() {
		super();
	}

	public String likeRomans(int wert) {
		if (wert >= 5) {
			return "V" + likeRomans(wert - 5);
		}
		if (wert >= 1) {
			return "I" + likeRomans(wert - 1);
		}
		return "";
	}
}
