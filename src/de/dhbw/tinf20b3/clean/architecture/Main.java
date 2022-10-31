package de.dhbw.tinf20b3.clean.architecture;

public class Main {

	public static void main(String[] args) throws Exception {
		Outbox myBox = new Outbox();
		myBox.start();
		myBox.versendeBaldmöglichst(new StringBasedSMS("Erste SMS"));
		Thread.sleep(2000L);
		myBox.versendeBaldmöglichst(new StringBasedSMS("Zweite SMS"));
		Thread.sleep(2000L);
		SMSSender unserSender = new SMSSender() {
			@Override
			public void versende(SMS nachricht) {
				System.out.println("Ich versende gerade: " + nachricht);
			}
		};
		myBox.meldeVerfügbar(unserSender);
		Thread.sleep(2000L);
		myBox.versendeBaldmöglichst(new StringBasedSMS("Dritte SMS"));
		Thread.sleep(1000L);
		myBox.meldeAb(unserSender);
		Thread.sleep(1000L);
		myBox.versendeBaldmöglichst(new StringBasedSMS("Vierte SMS"));
		myBox.versendeBaldmöglichst(new StringBasedSMS("Fünfte SMS"));
	}
}
