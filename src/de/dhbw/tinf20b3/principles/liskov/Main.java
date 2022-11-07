package de.dhbw.tinf20b3.principles.liskov;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Invarianz
		List<Integer> geheimeZahlen = List.of(1, 2, 3, 4, 5);
		//List<Number> meineZahlen = (List<Number>) geheimeZahlen;
		//System.out.println(meineZahlen);
		
		Integer[] geheim2 = new Integer[] {1, 2, 3, 4, 5};
		Number[] covariant = geheim2;
		//covariant[0] = 132.18D;
		
		Berechner b = new IntegerBerechner();
		System.out.println(b.berechne());
		System.out.println(b.berechne().getClass().getSimpleName());
	}
}
