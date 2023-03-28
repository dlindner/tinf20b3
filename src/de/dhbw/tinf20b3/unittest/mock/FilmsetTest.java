package de.dhbw.tinf20b3.unittest.mock;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;
import org.mockito.Mockito;

public class FilmsetTest {
	
	@Test
	public void funktionierendes_Ausleuchten() {
		Filmstar given = Mockito.mock(Filmstar.class);
		Mockito.when(given.werdeAusgeleuchtet()).thenReturn(true);
		Mockito.when(given.sageSignatureLine()).thenReturn("you are breathtaking");
		
		Filmset target = new Filmset(given);
		
		String actual = target.dreheSzene();
		
		assertThat(actual, equalTo("you are breathtaking"));
	}
	
	@Test
	public void nicht_funktionierendes_Ausleuchten() {
		Filmstar given = Mockito.mock(Filmstar.class);
		Mockito.when(given.werdeAusgeleuchtet()).thenReturn(false);
		//Mockito.when(given.sageSignatureLine()).thenReturn("Nothing is stronger than family");
		//Filmstar given = new VinDiesel();
		Filmset target = new Filmset(given);
		
		String actual = target.dreheSzene();
		
		assertThat(actual, equalTo(""));
		
		Mockito.verify(given, Mockito.never()).sageSignatureLine();
	}
}
