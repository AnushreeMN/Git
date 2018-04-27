package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Auto_constants {
	public WebDriver driver;
	@BeforeMethod
	public void openappln()
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
	}
	@AfterMethod
	public void closeappln()
	{
		driver.quit();
	}
	}



