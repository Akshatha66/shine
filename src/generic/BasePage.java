package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import generic.BaseTest;

public class BasePage extends BaseTest
{
	public static void elementPresent(WebElement element,WebDriver driver)
	{
		try 
		{
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("element found",true);
		}
		catch (Exception e)
		{
			Reporter.log("element not found",true);
			Assert.fail();
		}
	}
	
	public static void verrifyTitle(String title,WebDriver driver)
	{
		try 
		{
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("title found",true);
		}
		catch (Exception e) 
		{
			Reporter.log("title not found",true);
			Assert.fail();
		}
	}
	public static void element_clickable(WebElement element,WebDriver driver)
	{
		try 
		{
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element clickable",true);
		}
		catch (Exception e)
		{
			Reporter.log("Element not clickable",true);
			Assert.fail();
		}
	}
}
