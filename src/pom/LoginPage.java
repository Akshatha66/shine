package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;
public class LoginPage 
{
	@FindBy(xpath="//div[.='Sign In']")
	private WebElement bttn;
	
	@FindBy(id="id_email_login")
	private WebElement usrn;

	@FindBy(id="id_password")
	private WebElement pwd;
	
	@FindBy(name="login_popup")
	private WebElement loginbttn;
	
	@FindBy(name="forgot_popup")
	private WebElement forgotpop;
	
	@FindBy(id="candidateemailid")
	private WebElement forgottb;
	
	@FindBy(id="id_fpSubmit")
	private WebElement submitbtn;
	
	@FindBy(xpath="//span[.='close']")
	private WebElement closebttn;
	
	@FindBy(xpath="//strong[.='Login Through LinkedIn']")
	private WebElement Linkedbttn;
	
	@FindBy(id="session_key-login")
	private WebElement linkedemail;
	
	@FindBy(id="session_password-login")
	private WebElement linkedpwd;
	
	@FindBy(name="signin")
	private WebElement linkedsubmit;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SignIn(WebDriver driver) 
	{
		BasePage.elementPresent(bttn, driver);
		bttn.click();
	}
	public void username(WebDriver driver,String user)
	{
		BasePage.elementPresent(usrn, driver);
		usrn.sendKeys(user);
	}
	public void password(WebDriver driver,String password)
	{
		BasePage.elementPresent(pwd, driver);
		pwd.sendKeys(password);
	}
	public void log(WebDriver driver)
	{
		BasePage.elementPresent(loginbttn, driver);
		BasePage.element_clickable(loginbttn, driver);
		loginbttn.click();
		
	}
	public void login(String user, String password) throws InterruptedException
	{
		Thread.sleep(2000);
		usrn.sendKeys(user);
		Thread.sleep(2000);
		pwd.sendKeys(password);
		Thread.sleep(2000);
		loginbttn.click();
		
	}
	
	public void signin()
	{
		bttn.click();
	}
/*	public void username(String user)
	{	
		usrn.sendKeys(user);
	}
	public void password(String password)
	{
		pwd.sendKeys(password);
	}
	public void login()
	{
		loginbttn.click();
	}*/
	
	public void forgotpop()
	{
		
		forgotpop.click();
	}
	
	public void forgortext(String text)
	{
		forgottb.sendKeys(text);
	}
	
	public void submit()
	{
		submitbtn.click();
	}
	
	public void close()
	{
		closebttn.click();
	}
	
	public void loginthrhliked()
	{
		Linkedbttn.click();
	}
	
	public void linkedemail(String email)
	{
		linkedemail.sendKeys(email);
	}
	public void linkedpassword(String password)
	{
		linkedpwd.sendKeys(password);
	}
	public void linkedsubmit()
	{
		linkedsubmit.click();
	}

}
