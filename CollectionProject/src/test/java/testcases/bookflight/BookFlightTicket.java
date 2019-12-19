package testcases.bookflight;

import org.testng.annotations.Test;

import pages.HomePage;
import specificmethods.CommonMethods;

public class BookFlightTicket extends CommonMethods{
	
	@Test
	public void bookFlightBetweenMadrasToCoimbatore()
	{
		new HomePage().clickOnFlightsButton().enterFrom();
	}

}
