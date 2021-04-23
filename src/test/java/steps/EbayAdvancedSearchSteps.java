package steps;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.datatable.DataTable;

public class EbayAdvancedSearchSteps {
	WebDriver driver;
	ComunSteps cs;
	
	
	public EbayAdvancedSearchSteps(ComunSteps cs) {
		this.driver = cs.getdriver();
	}
	
	@Given("I am on ebay advanced search page")
	public void i_am_on_ebay_advanced_search_page() {
		
		driver.get("https://www.ebay.ca/sch/ebayadvsearch");
			    
	}
	@When("I click on Ebay logo")
	public void i_click_on_ebay_logo() {
		
		driver.findElement(By.id("gh-la")).click();
	    
	}
	@Then("I navigate to ebay home page")
	public void i_navigate_to_ebay_home_page() {
		
		String actuelURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ebay.ca/";
		//String expectedTitle = "eBay Search: Advanced Search";
		
		if(!expectedURL.equals(actuelURL)) {
			fail("Page Not found");
			
		}
		    
	}
	
	@When("I search advanced item")
	public void i_search_advanced_item(DataTable dataTable) throws Exception {
		driver.findElement(By.id("_nkw")).sendKeys(dataTable.cell(1, 0));
		driver.findElement(By.id("_ex_kw")).sendKeys(dataTable.cell(1, 1));
		driver.findElement(By.name("_udlo")).sendKeys(dataTable.cell(1, 2));
		driver.findElement(By.name("_udhi")).sendKeys(dataTable.cell(1, 3));
		Thread.sleep(2000);
		driver.findElement(By.id("searchBtnLowerLnk")).click();
	   
	}


	

}
