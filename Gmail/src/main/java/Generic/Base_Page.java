package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import junit.framework.Assert;

public abstract class Base_Page
{
public WebDriver driver;
public Base_Page(WebDriver driver)
{
	this.driver=driver;

}
public void verifyTitle(String title)
{
	WebDriverWait wait=new WebDriverWait(driver,10);
	try {
		wait.until(ExpectedConditions.titleContains(title));
		Reporter.log("title matching",true);
	}
	catch(Exception e) {
		Reporter.log("title not matching",true);
		Assert.fail();
	}
	}
	
	public void verifyElementIsPresent(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,10);
				try {
					wait.until(ExpectedConditions.visibilityOf(element));
					Reporter.log("element is present",true);
				}
		catch(Exception e) {
			Reporter.log("element not present",true);
			Assert.fail();
		}
		
				}
		

}


