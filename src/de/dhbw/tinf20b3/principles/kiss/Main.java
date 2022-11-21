package de.dhbw.tinf20b3.principles.kiss;

import java.util.Map;
import java.util.Optional;

public class Main {

	public static Optional<String> weekday3(int number) {
		Map<Integer, String> wochentage = Map.of(
			1, "Monday",
			2, "Tuesday",
			3, "Wednesday",
			4, "Thursday",
			5, "Friday",
			6, "Saturday",
			7, "Sunday"
		);
		return Optional.ofNullable(
			wochentage.get(number)
		);
	}
	
	public static void main(String[] args) {
		System.out.println(weekday3(1).orElse("Mist"));
		System.out.println(weekday3(0).orElse("Mist"));
		weekday3(7).map(s -> s.length()).ifPresent(System.out::println);
	}
}
