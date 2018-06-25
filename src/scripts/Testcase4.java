package scripts;

import org.testng.annotations.Test;

import generic.BasePage;
import generic.Excel;
import pom.HomePage;
import pom.LogOutPage;
import pom.LoginPage;
import pom.ProfilePage;

public class Testcase4 extends BasePage{
@Test
public void uploadskill() throws InterruptedException
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
	h.profile(driver);
	Thread.sleep(3000);
	h.MyProfile();
	ProfilePage p=new ProfilePage(driver);
	p.addskill();
	Thread.sleep(3000);
	p.skill(Excel.excelsheet(path, "sheet1", 2, 1));
	Thread.sleep(3000);
	p.selectexp(Excel.excelsheet(path, "sheet1", 2, 2));
	Thread.sleep(3000);
	p.saveexp();
	Thread.sleep(3000);
	LogOutPage l1=new LogOutPage(driver);
	l1.logout();
	
}
}
