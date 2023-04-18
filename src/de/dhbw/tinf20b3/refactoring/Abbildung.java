package de.dhbw.tinf20b3.refactoring;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.function.Function;

public class Abbildung {

	public static void main(String[] args) {
		Double parameter = 100.0D;
		
		Map<Integer, Function<Double, String>> abbildung = new HashMap<>();
		abbildung.put(1, x -> "Erstes");
		abbildung.put(2, y -> "Zweiteres " + y);
		abbildung.put(3, Abbildung::irgendwas);

		String textA = abbildung.get(2).apply(parameter);
		System.out.println(textA);

		String textA2 = abbildung.get(3).apply(parameter);
		System.out.println(textA2);
		
		//abbildung.put(2, "Neue Zwei");
		Function<Double, String> function = abbildung.get(2);
		String textB = function.apply(parameter);
		
		//String ergebnis = abbildung.getOrDefault(4, "Default wurde es!");
		//System.out.println(ergebnis);

		Properties properties = new Properties();
		properties.setProperty("schlüssel", "wert");
		properties.put("schlüssel2", 218);
}
	
	private static String irgendwas(Double zahl) {
		return "Drittes oder " + zahl + "tes Rad am Waagen";
	}
}
