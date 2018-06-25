package generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Slctcls {
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
