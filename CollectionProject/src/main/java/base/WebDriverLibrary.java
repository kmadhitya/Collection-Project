package base;


import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import actions.Browser;
import actions.Element;

public class WebDriverLibrary implements Browser, Element{

	public static RemoteWebDriver driver;
	
	@Override
	public void loadURL(String URL) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Override
	public WebElement locateElement(String locatorType, String locatorValue) {
		
		switch(locatorType.toLowerCase())
		{
		case "id": return driver.findElementById(locatorValue);
		case "name": return driver.findElementByName(locatorValue);
		case "xpath": return driver.findElementByXPath(locatorValue);
		
		}
		return null;
		
	}
	
	@Override
	public void click(WebElement ele) {
		ele.click();
	}

	@Override
	public void enterText(WebElement ele, String txt){
		ele.clear();
		ele.sendKeys(txt);
	}

	@Override
	public void switchToWindow(int index) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new LinkedList<String>(windowHandles);
		String string = list.get(index);
		driver.switchTo().window(string);
		
	}

	

	@Override
	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();
		
	}

	@Override
	public void close() {
		driver.close();
		
	}

	@Override
	public void quit() {
		driver.quit();
		
	}

}
