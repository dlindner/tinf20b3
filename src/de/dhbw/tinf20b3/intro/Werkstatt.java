package de.dhbw.tinf20b3.intro;

public class Werkstatt {

	public Werkstatt() {
		super();
	}
	
	public void repariere(Sportwagen wagen) {
		System.out.println("W1: Das wird schon wieder, Meister");
	}
	
	public void repariere(Porsche porsche) {
		System.out.println("W2: Nette Karre, auch angemeldet?");
	}
	
	public void repariere(Bugatti bugatti) {
		System.out.println("W3: Boah, bist du ein cooler Typ!");
	}
}
