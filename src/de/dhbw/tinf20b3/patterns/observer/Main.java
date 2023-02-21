package de.dhbw.tinf20b3.patterns.observer;

public class Main {

	public static void main(String[] args) {
		Subjekt subjekt = new Subjekt();
		subjekt.meldeAn(new GuterBeobachter());
		subjekt.meldeAn(new GuterBeobachter());
		for (int i = 0; i < 5; i++) {
			new Thread(
				subjekt::benachrichtige
			).start();
			System.out.println("Thread gestartet");
		}
	}
}
