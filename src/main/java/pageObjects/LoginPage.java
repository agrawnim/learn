package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class LoginPage extends Base
{
	public WebDriver driver;

    By RegisteredUser_EmailAddress=By.xpath("//input[@id='email']");
    By RegisteredUser_Password=By.xpath("//input[@type='password']");
    By RegisteredUser_LoginButton=By.xpath("//button[@id='SubmitLogin']");
	
    
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getRegisteredUser_EmailAddress()
	{
		return driver.findElement(RegisteredUser_EmailAddress);
	}
	
	public WebElement getRegisteredUser_Password()
	{
		return driver.findElement(RegisteredUser_Password);
	}
	
	public WebElement getRegisteredUser_LoginButton()
	{
		return driver.findElement(RegisteredUser_LoginButton);
	}
}
