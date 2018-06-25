package scripts;


import org.testng.annotations.Test;

import generic.BasePage;
import generic.Excel;
import pom.HomePage;
import pom.LoginPage;
import pom.ProfilePage;

public class Testcase5 extends BasePage{
	@Test
	public void remove_skill() throws InterruptedException
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
		Thread.sleep(2000);
		HomePage h=new HomePage(driver);
		h.profile(driver);
		Thread.sleep(2000);
		h.MyProfile();
		ProfilePage p=new ProfilePage(driver);
		p.removeskill();
		Thread.sleep(2000);
		p.removeyes();
		Thread.sleep(2000);
		h.profilename(driver);
		Thread.sleep(2000);
		h.logout(driver);
		
		
	}

}
