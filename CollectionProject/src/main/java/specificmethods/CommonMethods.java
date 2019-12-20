package specificmethods;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import base.WebDriverLibrary;

public class CommonMethods extends WebDriverLibrary{
	
	@Parameters({"url"})
	@BeforeMethod
	public void launchTheApplication(String url)
	{
		loadURL(url);
	}
	@AfterMethod
	public void closeBrowser()
	{
		close();
	}

}
