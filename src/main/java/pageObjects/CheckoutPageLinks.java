package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPageLinks
{
	private WebDriver driver;
	
	By firstProductSelected = By.xpath("//*[@id=\'product_2_9_0_0\']/td[2]/small[2]/a");
	
	
	public CheckoutPageLinks(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getfirstProductSelected()
	{
		return driver.findElement(firstProductSelected);
		
	}
	
}
