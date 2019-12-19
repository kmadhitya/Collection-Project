package pages;

import base.WebDriverLibrary;

public class HomePage extends WebDriverLibrary {
	
	public HomePage clickOnFlightsButton()
	{
		click(locateElement("XPATH","//a[text()='Flights']"));
		return this;
	}
	public HomePage enterFrom()
	{
		enterText((locateElement("XPATH","//label[text()='From']/following-sibling::input[1]")),"Madras, India");
		return this;
	}

}
