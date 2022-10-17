package de.dhbw.tinf20b3.intro;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		final Autohändler dealer = new Autohändler();
		ohneAbhängigkeit(
			dealer.sonderangebot(),
			dealer.premiumangebot()
		);
	}

	private static void ohneAbhängigkeit(Sportwagen auto0, Sportwagen auto1) {
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
		Reparaturtermin termin0 = werkstatt.auftragFür(auto0);
		//termin0.nehmeWahrIn(werkstatt);
		werkstatt.repariere(auto0);
		werkstatt.repariere(auto1);
		//meineAutos.forEach(werkstatt::repariere);
		for (Sportwagen each : meineAutos) {
			werkstatt.repariere(each);
		}
	}
}
