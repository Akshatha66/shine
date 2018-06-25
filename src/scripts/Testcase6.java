package scripts;

import org.testng.annotations.Test;

import generic.BasePage;
import generic.Excel;
import generic.Jse;
import pom.HomePage;
import pom.LogOutPage;
import pom.LoginPage;
import pom.ProfilePage;

public class Testcase6 extends BasePage {
	@Test
	public void updateinfo() throws InterruptedException
	{
		Jse j=new Jse();
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
		HomePage h=new HomePage(driver);
		h.profile(driver);
		Thread.sleep(2000);
		h.MyProfile();
		ProfilePage p=new ProfilePage(driver);
		p.editbttn();
		Thread.sleep(2000);
		j.javase(driver, "document.getElementById('id_name').value=''");
		Thread.sleep(2000);
		String name=Excel.excelsheet(path, "sheet1", 0, 2);
		p.addname(name);
		j.javase(driver, "document.getElementById('id_email').value=''");
		Thread.sleep(2000);
		String email=Excel.excelsheet(path, "sheet1", 0, 0);
		p.addemail(email);
		j.javase(driver, "document.getElementById('id_cell_phone').value=''");
		Thread.sleep(2000);
	//	String number=Excel.excelsheet(path, "sheet1", 1, 0);
		p.addphone("7204227751");
		Thread.sleep(2000);
		p.DOB();
		Thread.sleep(2000);
		p.Year("1995");
		Thread.sleep(2000);
		p.Month("Feb");
		Thread.sleep(2000);
		p.Date();
		Thread.sleep(2000);
		p.World("India",driver);
		Thread.sleep(2000);
		p.City("Bangalore");
		Thread.sleep(2000);
		p.gender();
		Thread.sleep(2000);
		p.submit();
		Thread.sleep(2000);
		LogOutPage l1=new LogOutPage(driver);
		l1.logout();
		
		
	}
	

}
