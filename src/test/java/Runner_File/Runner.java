package Runner_File;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="C:\\Broccoli\\Broccoli",
		glue="StepsDefinitions",
		dryRun=	false,
		stepNotifications=	true,
		plugin= {"pretty","html:target/cucumber-reports/CucumberTestReport.html"}
		
)
public class Runner {
	
	

}
