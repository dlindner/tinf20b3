package de.dhbw.tinf20b3.intro;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		final Porsche auto0 = new Porsche();
		final Bugatti auto1 = new Bugatti();
		
		final List<Sportwagen> meineAutos = List.of(
			auto0,
			auto1
		);
		
		auto0.flitze();
		auto1.flitze();
		// das
		//meineAutos.forEach(Sportwagen::flitze);
		// ist gleich
		for (Sportwagen each : meineAutos) {
			each.flitze();
		}
		
		final Werkstatt werkstatt = new Werkstatt();
		werkstatt.repariere(auto0);
		werkstatt.repariere(auto1);
		//meineAutos.forEach(werkstatt::repariere);
		for (Sportwagen each : meineAutos) {
			werkstatt.repariere(each);
		}
	}
}
