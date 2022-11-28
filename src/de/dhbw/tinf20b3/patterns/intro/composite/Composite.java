package de.dhbw.tinf20b3.patterns.intro.composite;

import java.util.List;

public class Composite extends Component {
	
	// Aggregation (0..N Elemente)
	private List<Component> children;
	// auch als Array möglich
	//private Component[] children;

	@Override
	public void operation() {
	}

	@Override
	public void add() {
	}

	@Override
	public void remove() {
	}

	@Override
	public void getChild() {
	}
}
