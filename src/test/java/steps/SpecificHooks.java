package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SpecificHooks {
	
	WebDriver driver;

	public SpecificHooks(ComunSteps cs) {
		driver = cs.getdriver();
	}
	
	@Before(value="@deletecookies", order=0)
	public void deleteCookies() {
		System.out.println("Scenario specific hook-- Cookies delete ");
	}
	
	@After("@deletecookies")
	public void deletecache() {
		System.out.println("Scenario specific hook-- Caches delete ");
	}
	

}
