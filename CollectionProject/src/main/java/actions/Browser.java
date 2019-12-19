package actions;

import org.openqa.selenium.WebElement;

public interface Browser {
	
	public void loadURL(String URL);
	
	
	public WebElement locateElement(String locatorType, String locatorValue);
	
	public void switchToWindow(int index);
	
	public void switchToDefaultContent();
	
	public void close();
	public void quit();
	
	
	

}
