package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"features"},
		glue= {"steps"},
		monochrome= true,
		plugin= {"pretty", "html:target/rapport.html"},
		dryRun=false,
		//name="logo"
		tags= "@t4 and @deletecookies"
		
		//tags= "@Regression or @smoke" 
		//plugin= {"pretty", "json:target/rapport.json"}
		//plugin= {"pretty", "junit:target/rapport.xml"}
		)
public class TestRunner {
	

}
