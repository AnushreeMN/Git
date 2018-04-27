package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pack.Base_Page;

public class LoginPage  extends Base_Page {
	
	@FindBy(xpath="//p[.='Use another account']")
	private WebElement acct;
	
	
	@FindBy(id="identifierId")
	private WebElement un;
	
	@FindBy(xpath="//span[.='Next']")
	private WebElement next1;
	
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(xpath="//span[.='Next']")
	private WebElement next2;
	
	public LoginPage(WebDriver driver)
	
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void acct()
	{
	acct.click();
		
	}
	
	
	public void setun(String un1)
	{
		un.sendKeys(un1);
		
	}
	public void click1()
	{
		next1.click();
		
	}
	public void pwd(String pwd1)
	{
		un.sendKeys(pwd1);
		
	}
	public void click2()
	{
		next2.click();
		
	}
	public void verifyLoginPage(String lp_title)
	{
		verifytitle(lp_title);
	}
}
		
	
	
	
	
	

