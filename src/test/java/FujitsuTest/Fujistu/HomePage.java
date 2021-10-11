package FujitsuTest.Fujistu;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javascript.Utility;
import pageObjects.CheckoutPageLinks;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.ShoppingMenuOptions;
import resources.Base;

public class HomePage extends Base
{
	@Test(priority=1,dataProvider="getData")
	public void signIn(String Username, String Password) throws IOException
	{
		driver=initializeDriver();
		String path=prop.getProperty("url");		
		driver.get(path);
		
		LandingPage lp=new LandingPage(driver);
		LoginPage  login=new LoginPage(driver);
		
		lp.getSignin().click();
		
		login.getRegisteredUser_EmailAddress().sendKeys(Username);
		login.getRegisteredUser_Password().sendKeys(Password);
		login.getRegisteredUser_LoginButton().click();
		
	}

	@Test(priority=2)
	public void HomePageNavigation() throws InterruptedException
	{
		ShoppingMenuOptions menuoptions= new ShoppingMenuOptions(driver);
		Utility utility=new Utility();
		
		Actions actions=new Actions(driver); 
		WebElement menu=menuoptions.getHoverOption_Women();
		actions.moveToElement(menu).perform();
		
		WebElement submenu=menuoptions.getSubMenu();
		actions.moveToElement(submenu).click().perform();
		
		utility.pageScroll(driver, 0, 700);
		
		menuoptions.getquickViewOptionBlouses().click();
	    driver.manage().window().maximize();
		
	    driver.switchTo().frame(menuoptions.gettestframe());
	    WebElement size=menuoptions.getsizeDropDown();
	    Select select=new Select(size);
	    select.selectByVisibleText("M");
	    
	    menuoptions.getbtnAddToCart().click();
	    
	    Thread.sleep(3000L);
	    WebDriverWait wait = new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.visibilityOf(menuoptions.getbtnContinueShopping())).click();
	    
	    Actions actions1=new Actions(driver); 
		WebElement menu1=menuoptions.getHoverOption_Women();
		actions.moveToElement(menu1).perform();
		
		WebElement submenu1=menuoptions.getSubMenu1();
		actions1.moveToElement(submenu1).click().perform();
	   	
		utility.pageScroll(driver, 0, 700);
		
		menuoptions.getviewOptionTshirts().click();
		
		
		driver.switchTo().frame(menuoptions.gettestframe());
		Thread.sleep(3000L);
		menuoptions.getbtnAddToCart().click();
		
		Thread.sleep(3000L);
		menuoptions.getbtnProceedToCheckout().click();
		
		utility.pageScroll(driver, 0, 500);
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[1][2];
		data[0][0]="nimisha.agrawal29@gmail.com";
		data[0][1]="FujitsuTest";
		
		return data;
	}
	
	@Test(priority=3)
	public void checkProductSize() throws IOException
	{
		//driver=initializeDriver();
		
		CheckoutPageLinks checkoutpageLinks=new CheckoutPageLinks(driver);
		
		String Text = checkoutpageLinks.getfirstProductSelected().getText();
		System.out.println(Text);
		
	}
}

