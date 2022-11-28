package de.dhbw.tinf20b3.patterns.intro.decorator;

public abstract class Decorator extends Component {
	
	// Assoziation (1 Element)
	private Component component;
	
	@Override
	public abstract void operation();
}
