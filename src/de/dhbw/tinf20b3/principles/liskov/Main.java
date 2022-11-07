package de.dhbw.tinf20b3.principles.liskov;

import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		// Invarianz
		List<Integer> geheimeZahlen = List.of(1, 2, 3, 4, 5);
		//List<Number> meineZahlen = (List<Number>) geheimeZahlen;
		//System.out.println(meineZahlen);
		
		// Kovarianz
		Integer[] geheim2 = new Integer[] {1, 2, 3, 4, 5};
		Number[] covariant = geheim2;
		//covariant[0] = 132.18D;
		
		Berechner b = new IntegerBerechner();
		System.out.println(b.berechne());
		System.out.println(b.berechne().getClass().getSimpleName());
		
		// kovariante Generics
		List<? extends Number> meineZahlen = geheimeZahlen;
		System.out.println(meineZahlen);
		
		// Kontravariante Generics
		List<Number> meineNumbers = List.of(1.1, 2.2, 3.3, 4.4, 5.5);
		List<? super Integer> meineIntegers = meineNumbers;
		System.out.println("Kontra: " + meineIntegers);
		System.out.println(meineIntegers.get(0).getClass().getSimpleName());
		
		// Acronym: PECS - Producer extends, Consumer super
		Optional<Integer> maybeInteger = Optional.empty();
		// maybeInteger.ifPresent(null); <-- Consumer
		// maybeInteger.or(null); <-- Producer
	}
}
