package de.dhbw.tinf20b3.intro;

public interface Auto {

	public void flitze();

	/*
	 * Termine müssen in der Zukunft liegen
	 */
	Reparaturtermin repariereMich();
	
//	default void fahre() {
//		flitze();
//	}
}
