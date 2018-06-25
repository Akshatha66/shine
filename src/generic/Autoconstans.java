package generic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Autoconstans
{
	public void actionmoveto(WebElement ele,WebDriver driver)
 	{
	 	Actions a=new Actions(driver);
	 	a.moveToElement(ele).perform();
	}	
	public void select(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	
	}
	public void select(WebElement ele,int index)
	{
		Select s=new Select(ele);
		s.selectByIndex(index);
	
	}

}
