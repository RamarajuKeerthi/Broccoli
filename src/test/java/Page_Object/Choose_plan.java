package Page_Object;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Javasciptcxecuter.Java_Scroll;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Choose_plan 
{
	WebDriver  driver;
	@FindBy(xpath ="(//*[@class='nav-link text-dark listitems'])[1]")
	WebElement ditemeals;
	@FindBy(xpath ="(//*[@class='w-100 dietbutton'])[2]")
	WebElement planditels;
//	@FindBy(linkText  ="Plan details")
//	WebElement planditels1;
	@FindBy(xpath ="(//*[@class='vegchoose w-100'])[1]")
	WebElement choosemeala;
	@FindBy(xpath   = "(//*[@class='chooselastbtn1'])[1]")
	WebElement oderthisplan;
	@FindBy(xpath ="(//*[@class='form-select'])[1]")
	WebElement name;
	@FindBy(xpath ="(//*[@class='form-control'])[1]")
	WebElement fname;
	@FindBy(xpath ="(//*[@class='form-control'])[2]")
	WebElement lname;
	@FindBy(xpath ="(//*[@class='form-control'])[3]")
	WebElement emaill;
	@FindBy(xpath ="(//*[@class='form-control'])[4]")
	WebElement password;
	@FindBy(xpath ="//*[@class='orderbtn']")
	WebElement submit;
	@FindBy(xpath ="(//*[@class='vegbutton1'])[1]")
	WebElement vegplan;
	public   Choose_plan(WebDriver driver1) 
	{
		PageFactory.initElements(driver1, this);
		 driver = driver1;
	}
	
	public void Ditemeals() throws InterruptedException 
	{  
	   Thread.sleep(5000);

		ditemeals.click();
		
	}
	public void Planditels() throws InterruptedException 
	{
		//Thread.sleep(5000);
		Java_Scroll.name(driver, planditels);
		Java_Scroll.name(driver, vegplan);

		
	}
	public void Choosemeals() throws InterruptedException
	{
		Thread.sleep(5000);
		Java_Scroll.name(driver, choosemeala);
//		String s=driver.findElement(By.xpath("//*[text()='Choose a meal plan']")).getText();
//		String a="Choose a meal plan";
//		Assert.assertEquals(s, a);
//		System.out.println("when user click the choose meals button title is"+s);
	}
	public void Oderpans() throws InterruptedException 
	{
		try
		{
			Java_Scroll.name(driver, oderthisplan);
		} 
		catch (Exception e) {
			System.out.println("error is "+ e);
		}
		
		
//		WebDriverWait  wait = new WebDriverWait(driver,Duration .ofSeconds(20));
//		 WebElement r=wait.until(ExpectedConditions.elementToBeClickable(planditels));
//		 r.click();
		
		
	}
	public void Inputs() throws IOException 
	{

		FileInputStream fis= new FileInputStream("C:\\Broccoli\\Broccoli\\src\\test\\resources\\inputs.xlsx");
		XSSFWorkbook a=new XSSFWorkbook(fis);
		XSSFSheet ram=a.getSheet("ramaraju");
		  Select r = new Select(name);	
		  r.selectByVisibleText("Mr");
		  fname.sendKeys(ram.getRow(1).getCell(1).getStringCellValue());
		  lname.sendKeys(ram.getRow(1).getCell(2).getStringCellValue());
		  emaill.sendKeys(ram.getRow(1).getCell(3).getStringCellValue());
		  password.sendKeys(ram.getRow(1).getCell(4).getStringCellValue());
	  
	}
	public void Submit() 
	{
		submit.submit();
//		String e= driver.getTitle();
//		String a="ramraj";
//		Assert.assertEquals(e, a);
	}
}
