package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingMenuOptions
{
	public WebDriver driver;
	
	By HoverOption_Women = By.xpath("//a[@title='Women']");
	By SubMenu = By.xpath("//a[@Title='Blouses']");
	By SubMenu1 = By.xpath("//a[@Title='T-shirts']");
	By quickViewOptionBlouses = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/div[1]/a/i");
	By sizeDropDown = By.xpath("//select[@name=\'group_1\']");
	By btnAddToCart = By.xpath("//span[text()=\'Add to cart\']"); 
	By testframe = By.xpath("//iframe[@class=\"fancybox-iframe\"]");
	By windowContinueShopping = By.xpath("//div[@class=\'layer_cart_cart col-xs-12 col-md-6\']");
	By btnContinueShopping = By.xpath("//span[@title=\'Continue shopping\']");
	By btnProceedToCheckout = By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span");
	By viewOptionTshirts = By.xpath("//img[@title=\'Faded Short Sleeve T-shirts\']");
	
	public ShoppingMenuOptions(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getHoverOption_Women()
	{
		return driver.findElement(HoverOption_Women);
	}
	
	public WebElement getSubMenu()
	{
		return driver.findElement(SubMenu);
	}
	
	public WebElement getquickViewOptionBlouses()
	{
		return driver.findElement(quickViewOptionBlouses);
	}
	
	public WebElement getsizeDropDown()
	{
		return driver.findElement(sizeDropDown);
	}
	
	public WebElement getbtnAddToCart()
	{
		return driver.findElement(btnAddToCart);
	}
	
	public WebElement gettestframe()
	{
		return driver.findElement(testframe);
	}
	
	public WebElement getbtnContinueShopping()
	{
		return driver.findElement(btnContinueShopping);
	}
	
	public WebElement getwindowContinueShopping()
	{
		return driver.findElement(windowContinueShopping);
	}
	
	public WebElement getbtnProceedToCheckout()
	{
		return driver.findElement(btnProceedToCheckout);
	}
	
	public WebElement getSubMenu1()
	{
		return driver.findElement(SubMenu1);
	}
	
	public WebElement getviewOptionTshirts()
	{
		return driver.findElement(viewOptionTshirts);
	}
}
