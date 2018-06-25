package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.Autoconstans;
import generic.BasePage;

public class HomePage
{
	@FindBy(xpath="//span[@class='spanName']")
	private WebElement proflebttn;
	
	@FindBy(xpath="//a[.='Sign out']")
	private WebElement logoutbttn;
	
	@FindBy(xpath="//a[.='Account Settings']")
	private WebElement accountsettingsbttn;
	
	@FindBy(xpath="//a[.='Change Password']")
	private WebElement chngpwdbttn;
	
	@FindBy(id="id_old_password")
	private WebElement oldpswd;
	
	@FindBy(id="id_new_password")
	private WebElement newpswd;
	
	@FindBy(id="id_confirm_password")
	private WebElement renew;
	
	@FindBy(id="id_cpSubmit")
	private WebElement submitbtn;
	
	@FindBy(id="id_cpCancel")
	private WebElement cancelbttn;
	
	@FindBy(xpath="//a[@href='/myshine/myprofile/']")
	private WebElement profilebtn;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[.='My Profile']")
	private WebElement myprof;
	
	
	//profile Hi TULASI
	public void profilename(WebDriver driver)
	{
		BasePage.elementPresent(proflebttn, driver);
		BasePage.element_clickable(proflebttn, driver);
		Autoconstans a=new Autoconstans();
		a.actionmoveto(proflebttn, driver);
		
	}
	// Logout
	public void logout(WebDriver driver)
	{
		BasePage.elementPresent(logoutbttn, driver);
		logoutbttn.click();
	}
	//account settings
	public void accountsettings() 
	{
		
		accountsettingsbttn.click();
	}
	//Profile
	public void profile(WebDriver driver)
	{
		Autoconstans a=new Autoconstans();
		a.actionmoveto(profilebtn, driver);
	}
	//My profile
	public void MyProfile()
	{
		profilebtn.click();
	}
	//Change password
	public void changepassword()
	{
		chngpwdbttn.click();
	}
	public void oldpswrd(String old)
	{
		oldpswd.sendKeys(old);
	}
	public void newpasssword(String newpwd)
	{
		newpswd.sendKeys(newpwd);
	}
	public void reEnterpwd(String newpwd)
	{
		renew.sendKeys(newpwd);
	}
	public void submitchngpwd() throws InterruptedException
	{
		submitbtn.click();
		Thread.sleep(2000);
		cancelbttn.click();
	}
	

}
