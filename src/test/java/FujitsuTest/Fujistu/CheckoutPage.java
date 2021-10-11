package FujitsuTest.Fujistu;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.CheckoutPageLinks;
import resources.Base;

public class CheckoutPage extends Base
{
	@Test(enabled=false)
	public void checkProductSize() throws IOException
	{
		driver=initializeDriver();
		
		CheckoutPageLinks checkoutpageLinks=new CheckoutPageLinks(driver);
		
		String Text = checkoutpageLinks.getfirstProductSelected().getText();
		System.out.println(Text);
		System.out.println(Text);
		
	}
}
