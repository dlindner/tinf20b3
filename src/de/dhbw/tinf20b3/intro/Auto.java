package de.dhbw.tinf20b3.intro;

public interface Auto {

	public void flitze();

	/*
	 * Termine m�ssen in der Zukunft liegen
	 */
	Reparaturtermin repariereMich();
	
//	default void fahre() {
//		flitze();
//	}
}
