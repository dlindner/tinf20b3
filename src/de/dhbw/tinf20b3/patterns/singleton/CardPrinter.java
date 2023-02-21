package de.dhbw.tinf20b3.patterns.singleton;

public final class CardPrinter {

//	private static final Object lock = new Object();
	private static CardPrinter myInstance = new CardPrinter();
	
	private CardPrinter() {
		super();
	}
	
	public static CardPrinter getInstance() {
		return myInstance;
//		synchronized (lock) {
//			if (myInstance == null) {
//				myInstance = new CardPrinter();
//			}
//			return myInstance;
//		}
	}
	
	public static void nonSynchronized() {
		System.out.println("Hello");
	}
}
