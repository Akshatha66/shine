package scripts;

import org.testng.annotations.Test;

import generic.BasePage;
import generic.Excel;
import pom.LoginPage;

public class Testcase2 extends BasePage
{
	@Test
	public void forgotpass() throws InterruptedException
	{
		LoginPage l=new LoginPage(driver);
		l.signin();
		Thread.sleep(2000);
		l.forgotpop();
		Thread.sleep(2000);
		l.forgortext(Excel.excelsheet(path, "sheet1", 0, 0));
		Thread.sleep(2000);
		l.submit();
		Thread.sleep(2000);
		l.close();
	}
}
