package de.dhbw.tinf20b3.unittest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class RomanNumeralTest {

	@Test
	public void converts_1() {
		// Arrange
		int given = 1;
		RomanNumeral target = new RomanNumeral();
		// Act
		String actual = target.likeRomans(given); // <--- CUT
		// Assert
		assertThat(actual, equalTo("I"));
	}

	@Test
	public void converts_2() {
		RomanNumeral target = new RomanNumeral();
		String actual = target.likeRomans(2); // <--- CUT
		assertThat(actual, equalTo("II"));
	}
	
	@Test
	public void converts_3() {
		RomanNumeral target = new RomanNumeral();
		String actual = target.likeRomans(3); // <--- CUT
		assertThat(actual, equalTo("III"));
	}

	@Test
	public void converts_4() {
		RomanNumeral target = new RomanNumeral();
		String actual = target.likeRomans(4); // <--- CUT
		assertThat(actual, equalTo("IV"));
	}

	@Test
	public void converts_5() {
		RomanNumeral target = new RomanNumeral();
		String actual = target.likeRomans(5); // <--- CUT
		assertThat(actual, equalTo("V"));
	}
}
