package de.dhbw.tinf20b3.intro;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Werkstatt {
	
	private final Map<Class<? extends Sportwagen>, String> terminvergabe;

	public Werkstatt() {
		super();
		this.terminvergabe = new HashMap<>();
		this.terminvergabe.put(Sportwagen.class, "Termin für Sportwagen");
		this.terminvergabe.put(Porsche.class, "Termin für Porsche");
		this.terminvergabe.put(Bugatti.class, "Termin für Bugatti");
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

	public Reparaturtermin auftragFür(Sportwagen irgendeinAuto) {
		String text = this.terminvergabe.get(irgendeinAuto.getClass());
		System.out.println("Ich will einen " + text);
		
		return irgendeinAuto.repariereMich();
//		if (irgendeinAuto instanceof Porsche) {
//			return new PorscheReparaturtermin((Porsche) irgendeinAuto);
//		}
//		if (irgendeinAuto instanceof Bugatti) {
//			return new BugattiReparaturtermin((Bugatti) irgendeinAuto);
//		}
//		return new Reparaturtermin(irgendeinAuto);
	}
}
