package de.dhbw.tinf20b3.patterns.intro.singleton;

import java.util.Iterator;

public enum RealCardPrinter implements ICardReader {

	myInstance,
	;
	
	public void print() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		RealCardPrinter.myInstance.print();
	}
}
