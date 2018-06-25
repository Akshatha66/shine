package scripts;

import org.testng.annotations.Test;

import generic.BasePage;
import generic.Excel;
import pom.HomePage;
import pom.LoginPage;
import pom.ProfilePage;

public class Testcase8 extends BasePage{
	@Test
	public void uploadresume() throws InterruptedException
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
		HomePage h=new HomePage(driver);
		Thread.sleep(3000);
		h.profile(driver);
		Thread.sleep(3000);
		h.MyProfile();
		ProfilePage p=new ProfilePage(driver);
		Thread.sleep(2000);
		p.newresbutton();
		Thread.sleep(2000);
		p.browse("C:\\Users\\DELL\\Desktop\\Tulsiresume.docx");
		Thread.sleep(2000);
		p.upldbutton();
		Thread.sleep(3000);
		h.profilename(driver);
		Thread.sleep(3000);
		h.logout(driver);
	}

}
