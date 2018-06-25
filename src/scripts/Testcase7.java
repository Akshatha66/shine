package scripts;

import org.testng.annotations.Test;

import generic.BasePage;
import generic.Excel;
//import generic.Jse;
import pom.HomePage;
import pom.LoginPage;
import pom.ProfilePage;

public class Testcase7 extends BasePage {
	@Test
	public void updatequal() throws InterruptedException
	{
	//	Jse j=new Jse();
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
		p.editedu();
		Thread.sleep(2000);
		p.addcollege("Bellary");
		Thread.sleep(2000);
	//	j.javase(driver,"document.getElementById('id_institute_name').value=''");
		//p.addcollege(" Bellary");
		p.addyopsubmit("2017");
		p.submitedu();
		h.profilename(driver);
		Thread.sleep(2000);
		h.logout(driver);
		
		
		
	}

}
