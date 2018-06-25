package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Constants
{
	
	
	public WebDriver driver;
	@BeforeMethod
	public void launchapplication()
		{
			System.setProperty(Chrome_key, Chrome_value);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
			driver.get("https://www.shine.com/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	
	@AfterMethod
	public void closeapplication()
		{
			driver.close();
		}
}
