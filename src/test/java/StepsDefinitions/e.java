package StepsDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class e 
{
	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			driver.get("https://broccoly.onrender.com/");
			driver.findElement(By.xpath("(//*[@class='nav-link text-dark listitems'])[1]")).click();
			driver.findElement(By.xpath("(//button[@class='w-100 dietbutton'])[2]")).click();
		
	}
}
