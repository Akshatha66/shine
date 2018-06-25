package generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class Jse {
	public void javase(WebDriver driver,String ele)
	{
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript(ele);
	}

}
