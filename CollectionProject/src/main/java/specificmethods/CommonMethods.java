package specificmethods;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import base.WebDriverLibrary;

public class CommonMethods extends WebDriverLibrary{
	
	@BeforeMethod
	public void launchTheApplication()
	{
		loadURL("https://www.cheapair.com/");
	}
	@AfterMethod
	public void closeBrowser()
	{
		close();
	}

}
