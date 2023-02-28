package de.dhbw.tinf20b3.patterns.decorator;

public class Textanzeige implements VisuelleKomponente {
	
	private String text;

	public Textanzeige(String text) {
		super();
		this.text = text;
	}
	
	@Override
	public void zeichne() {
		System.out.println(this.text);
	}
}
