package StepsDefinitions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Excel.Excle_properties;
import Page_Object.Choose_plan;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Choose_Plan_Steps
{
	WebDriver driver;
	Choose_plan open;
	
	@Given("user lanch the url of Broccoli")
	public void user_lanch_the_url_of_broccoli() throws IOException
	{
		
		WebDriverManager.chromedriver().setup();			
		ChromeOptions option = new ChromeOptions();
	    option.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(Excle_properties.url());
		
	}

	@Given("click the dite plan butoon")
	public void click_the_dite_plan_butoon() throws InterruptedException {
		open=new Choose_plan (driver);
		open.Choosemeals();
	}

	@Given("click the plan ditels button")
	public void click_the_plan_ditels_button() throws InterruptedException
	 {
		Thread.sleep(5000);
		open.Planditels();
		
	}

	@Given("click the chose meals button")
	public void click_the_chose_meals_button() throws InterruptedException {
		 open.Choosemeals();
	}

	@Given("click the oder plan button")
	public void click_the_oder_plan_button() throws InterruptedException 
	{
		 open.Oderpans();
		 Thread.sleep(5000);
	}
	@When("enter tha all inputs")
	public void enter_tha_all_inputs() throws IOException {
		open.Inputs();
	}

	@When("click the submit button")
	public void click_tthe_submit_button() {
		open.Submit();
	}

	
}
