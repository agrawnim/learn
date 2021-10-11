package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Utility
{
	
	public void pageScroll(WebDriver driver, int min, int max)
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+min+ "," +max+")");
	}

}
