package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/java/features",
		glue="stepDefinations" , stepNotifications=true , monochrome=true,
		
		tags="@ahmad or @Mobiletest" 
		
		
		)




public class TestRunner {

}
