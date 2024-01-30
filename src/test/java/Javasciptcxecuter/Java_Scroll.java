package Javasciptcxecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Java_Scroll 
{
	public static void name(WebDriver driver,WebElement r)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",r);
		JavascriptExecutor s = (JavascriptExecutor)driver;
        s.executeScript("arguments[0].click();", r);
	}
}
