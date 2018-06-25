package scripts;

import org.testng.annotations.Test;

import generic.BasePage;
import pom.LogOutPage;
import pom.LoginPage;

public class Testcase1 extends BasePage
{
	@Test
	public void ThroughLinked() throws InterruptedException
	{
		LoginPage l=new LoginPage(driver);
		Thread.sleep(2000);
		l.signin();
		Thread.sleep(2000);
		l.loginthrhliked();
		Thread.sleep(2000);
		l.linkedemail("tulasireddy1002@gmail.com");
		Thread.sleep(2000);
		l.linkedpassword("Tvinay_102");
		Thread.sleep(2000);
		l.linkedsubmit();
		Thread.sleep(2000);
		LogOutPage l1=new LogOutPage(driver);
		l1.logout();
	}
}
