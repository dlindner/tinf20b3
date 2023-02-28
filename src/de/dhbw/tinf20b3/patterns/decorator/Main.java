package de.dhbw.tinf20b3.patterns.decorator;

public class Main {

	public static void main(String[] args) {
		VisuelleKomponente terminal = new Textanzeige("TINF20B3");
		VisuelleKomponente intermediate1 = new ScrollDekorierer(terminal);
		VisuelleKomponente intermediate2 = new RahmenDekorierer(intermediate1);
		VisuelleKomponente intermediate3 = new LeerzeileNachherDekorierer(intermediate2);
		VisuelleKomponente intermediate4 = new LeerzeileVorherDekorierer(intermediate3);
		
		VisuelleKomponente au�en = intermediate4;
		au�en.zeichne();
		
		VisuelleKomponente terminalB = new CoolesTerminal();
		VisuelleKomponente intermediateB1 = new ScrollDekorierer(terminalB);
		VisuelleKomponente intermediateB1a = new ScrollDekorierer(intermediateB1);
		VisuelleKomponente intermediateB2 = new RahmenDekorierer(intermediateB1a);
		
		VisuelleKomponente au�enB = intermediateB2;
		au�enB.zeichne();
	}
}
