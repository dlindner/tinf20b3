package de.dhbw.tinf20b3.refactoring;

import java.util.Optional;

public class AngleProvider {

	private Sensor sensor;

	// Maybe, Promise, Optional
	Optional<Integer> getAngle() {
		if (sensor.isWorking()) {
			return Optional.of(
				sensor.getAngle()
			);
		}
		return Optional.empty();
	}
	
	Optional<Person> findPersonBy(String name) throws DatabaseException {
		return Optional.empty();
	}
	
	private void react_to_empty_Optional() {
		Optional<Integer> number = Optional.empty();
		number.ifPresent(System.out::println);
		Optional<String> maybeText = number.map(zahl -> String.valueOf(zahl));
	}
	
	// Exception
	// Maybe
}
