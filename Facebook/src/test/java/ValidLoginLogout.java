import org.testng.annotations.Test;

import POM.LoginPage;
import pack.Base_Test;

public class ValidLoginLogout extends Base_Test{
	@Test
	public void testValidLoginLogout() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		
		 lp.acct();
		 lp.setun("anushree.mn12@gmail.com");
		 lp.click1();
		 lp.pwd("anusri1990");
		 lp.click2();
		 
		 lp.verifyLoginPage("https://mail.google.com/mail/u/0/#inbox");
		 
	}

}
