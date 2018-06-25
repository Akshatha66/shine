package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action{
 public void action(WebDriver driver,WebElement ele)
 	{
	 	Actions a=new Actions(driver);
	 	a.moveToElement(ele).perform();
	}

}
