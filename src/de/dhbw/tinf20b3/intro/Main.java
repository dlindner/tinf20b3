package de.dhbw.tinf20b3.intro;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		final Autoh�ndler dealer = new Zwischenh�ndler(new Sportwagendealer());
		ohneAbh�ngigkeit(
			dealer.sonderangebot(),
			dealer.premiumangebot()
		);
	}

	private static void ohneAbh�ngigkeit(
		Auto auto0,
		Auto auto1
	) {
		final List<Auto> meineAutos = List.of(
			auto0,
			auto1
		);
		
		auto0.flitze();
		auto1.flitze();
		// das
		//meineAutos.forEach(Sportwagen::flitze);
		// ist gleich
		for (Auto each : meineAutos) {
			each.flitze();
		}
		
		final Werkstatt werkstatt = new Werkstatt();
		Reparaturtermin termin0 = werkstatt.auftragF�r(auto0);
		//termin0.nehmeWahrIn(werkstatt);
		werkstatt.repariere(auto0);
		werkstatt.repariere(auto1);
		//meineAutos.forEach(werkstatt::repariere);
		for (Auto each : meineAutos) {
			werkstatt.repariere(each);
		}
	}
}
