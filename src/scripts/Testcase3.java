package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.BasePage;
import generic.Excel;
import pom.HomePage;
import pom.LoginPage;

public class Testcase3 extends BasePage
{
	@Test
	public void login() throws InterruptedException 
	{
		LoginPage l=new LoginPage(driver);
		l.SignIn(driver);
		Thread.sleep(2000);
		String usern=Excel.excelsheet(path, "sheet1", 0, 0);
		l.username(driver, usern);
		Thread.sleep(2000);
		String pwd=Excel.excelsheet(path, "sheet1", 0, 1);
		l.password(driver, pwd);
		Thread.sleep(2000);
		l.log(driver);
		String t=driver.getTitle();
		SoftAssert a=new SoftAssert();
		a.assertEquals(t,"Shine.com-My Shine|Home");
		Reporter.log("logged in succesful",true);
		HomePage h=new HomePage(driver);
		h.profilename(driver);
		Thread.sleep(2000);
		h.logout(driver);
		String title1=driver.getTitle();
		a.assertEquals(title1,"Shine.com-My Shine|Logout");
		Reporter.log("Logged out succesfully",true);
	
	}
	
}
