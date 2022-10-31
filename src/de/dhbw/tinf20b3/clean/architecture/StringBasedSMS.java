package de.dhbw.tinf20b3.clean.architecture;

public class StringBasedSMS implements SMS {
	
	private final String text;

	public StringBasedSMS(String text) {
		super();
		this.text = text;
	}
	
	@Override
	public String alsText() {
		return this.text;
	}
	
	@Override
	public String toString() {
		return alsText();
	}
}