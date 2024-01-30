package Page_Object;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Driver;
import com.sun.java.swing.plaf.windows.resources.windows;

import io.github.bonigarcia.wdm.WebDriverManager;



public class RR
{
	
	public static void main(String[] args) throws InterruptedException
	{
		try {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			driver.get("https://broccoly.onrender.com/");
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//*[@class='nav-link text-dark listitems'])[1]")).click();
			Thread.sleep(5000);

		  Thread.sleep(5000);
		  
		  //Step 1
		//  WebElement firstbutton= driver.findElement(By.xpath("Your Element"));
		  Actions actions = new Actions(driver);
			WebElement ram= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[4]/div/div/div/a/button"));
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			//jse.executeScript("window.scrollBy(0,1000)");
			//jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			jse.executeScript("arguments[0].scrollIntoView(true);",ram);
			
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[4]/div/div/div/a/button")).click();
			JavascriptExecutor s = (JavascriptExecutor)driver;
			s.executeScript("arguments[0].click();", ram);
//		  actions.moveToElement(ram);
//		  actions.perform();
//		  actions.click().perform();
//		 JavascriptExecutor s = (JavascriptExecutor)driver;
//
//		 s.executeScript(“window.scrollIntoView();”, ram);
	  
		  System.out.println("Success");
			
		} catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
		
//		JavascriptExecutor s = (JavascriptExecutor)driver;
//        s.executeScript("arguments[0].click();", ram);
        //Choose_plan open = new Choose_plan(driver);
        //Javasciptcxecuter.jse(driver, choosemeals());
       
//        WebDriverWait wait = new WebDriverWait(driver,null);
//        WebElement r=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='w-100 dietbutton'])[2]")));
//		 r.click();
        
	}   
}
