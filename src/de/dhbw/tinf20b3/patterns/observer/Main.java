package de.dhbw.tinf20b3.patterns.observer;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Subjekt subjekt = new Subjekt();
		subjekt.meldeAn(new GuterBeobachter());
		subjekt.meldeAn(new GuterBeobachter());
		subjekt.meldeAn(new BöserBeobachter());
		for (int i = 0; i < 5; i++) {
			Runnable meineAktion = new Runnable() {
				@Override
				public void run() {
					subjekt.benachrichtige();
				}
			};
			Runnable meineAktion2 = () -> {
				subjekt.benachrichtige();
			};
			Runnable meineAktion3 = () -> subjekt.benachrichtige();
			Runnable meineAktion4 = subjekt::benachrichtige;
			//Runnable meineAktion5 = new Object()::notifyAll;
			
			new Thread(meineAktion).start();
			System.out.println("Thread gestartet");
		}
		System.out.println("<<<--- i am out");
	}
}
