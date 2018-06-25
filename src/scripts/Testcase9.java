package scripts;

import org.testng.annotations.Test;

import generic.BasePage;
import generic.Excel;
import pom.HomePage;
import pom.LogOutPage;
import pom.LoginPage;
import pom.ProfilePage;

public class Testcase9 extends BasePage {
	@Test
	public void adcertification() throws InterruptedException
	{
		LoginPage l=new LoginPage(driver);
		l.SignIn(driver);
		Thread.sleep(3000);
		String usern=Excel.excelsheet(path, "sheet1", 0, 0);
		l.username(driver, usern);
		Thread.sleep(3000);
		String pwd=Excel.excelsheet(path, "sheet1", 0, 1);
		l.password(driver, pwd);
		Thread.sleep(3000);
		l.log(driver);
		Thread.sleep(3000);
		HomePage h=new HomePage(driver);
		Thread.sleep(3000);
		h.profile(driver);
		Thread.sleep(3000);
		ProfilePage p=new ProfilePage(driver);
		p.addnewcert();
		Thread.sleep(5000);
		p.certname("Selenium");
		Thread.sleep(3000);
		p.certyear();
		Thread.sleep(3000);
		p.saveexp();
		Thread.sleep(5000);
		LogOutPage l1=new LogOutPage(driver);
		l1.logout();
		
	}
	
}
