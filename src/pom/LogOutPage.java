package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	@FindBy(xpath="//li[@class='dropdown posRel infomenu carrerInfo lgout']")
	private WebElement proflebttn;
	
	@FindBy(xpath="//a[.='Sign out']")
	private WebElement logoutbttn;
	
	public LogOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logout() throws InterruptedException 
	{
		
		proflebttn.click();
		Thread.sleep(3000);
		logoutbttn.click();
	}

}
