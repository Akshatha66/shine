package scripts;


import org.testng.annotations.Test;

import generic.BasePage;
import generic.Excel;
import pom.HomePage;
import pom.LoginPage;

public class Testscript10 extends BasePage {
	@Test
	public void CreateAlert() throws InterruptedException
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
		h.profilename(driver);
		Thread.sleep(2000);
		h.accountsettings();
		Thread.sleep(2000);
		h.changepassword();
		Thread.sleep(2000);
		h.oldpswrd(Excel.excelsheet(path, "sheet1", 0, 1));
		Thread.sleep(2000);
		h.newpasssword(Excel.excelsheet(path, "sheet1", 3, 2));
		Thread.sleep(2000);
		h.reEnterpwd(Excel.excelsheet(path, "sheet1", 3, 2));
		Thread.sleep(2000);
		h.submitchngpwd();
		Thread.sleep(2000);
		h.profilename(driver);
		Thread.sleep(3000);
		h.logout(driver);
		
		
	}

}
