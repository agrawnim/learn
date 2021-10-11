package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage
{
	public WebDriver driver;
	
	By Signin=By.xpath("//a[@class='login']");

	

	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement getSignin()
	{
		return driver.findElement(Signin);
	}
	
	
	
}
