package steps;

import static org.junit.Assert.fail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayHome_steps {
	WebDriver driver;
	ComunSteps cs;
	
	public EbayHome_steps(ComunSteps cs) {
		this.driver = cs.getdriver();
	}

	@Given("I am on the Ebay home page")
	public void i_am_on_the_ebay_home_page() {
		
		driver.get("https://www.ebay.ca/");

	}

	@When("I click on advanced link")
	public void i_click_on_advanced_link() {
		driver.findElement(By.id("gh-as-a")).click();

	}

	@Then("I naviguate to the advanced search page")
	public void i_naviguate_to_the_advanced_search_page() {
		String actuelURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ebay.ca/sch/ebayadvsearch";
		// String expectedTitle = "eBay Search: Advanced Search";

		if (!expectedURL.equals(actuelURL)) {
			fail("Page Not found");

		}

	}

	@When("I search for {string}")
	public void i_search_for_iphone(String item) {
		driver.findElement(By.id("gh-ac")).sendKeys(item);
		driver.findElement(By.id("gh-btn")).click();

	}

	@Then("I validate at least 1000 search items present")
	public void i_validate_at_least_search_items_present() {
		String ItemCount = driver.findElement(By.xpath("(//h1[@class=\"srp-controls__count-heading\"]/span)[1]")).getText().trim();
		String ItemCount2 = ItemCount.replace(",", ""); //1,257 ----> 1257
		int ItemCountInt = Integer.parseInt(ItemCount2); //string ----> integer
		
		if(ItemCountInt <= 1000) {
			fail("Moins de 1000 item que sont affiche");
		}
		System.out.println("Le nombre des items trouves est: " + ItemCountInt);
		
	}
	
	
	@When("I search for {string} in {string} category")
	public void i_search_for_in_category(String item, String category) throws Exception {
		driver.findElement(By.id("gh-ac")).sendKeys(item);
		List<WebElement>listcat =driver.findElements(By.cssSelector("select#gh-cat>option"));
		for(WebElement el:listcat){
			if(el.getText().trim().toLowerCase().equals(category.toLowerCase())){
				el.click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.id("gh-btn")).click();
	}

	@When("I click on {string}")
	public void i_click_on(String link) throws Exception {
		driver.findElement(By.linkText(link)).click();
		Thread.sleep(2000);
	    
	}
	
	@Then("I validate that page navigates to {string} and title contains {string}")
	public void i_validate_that_page_navigates_to_and_title_contains(String url, String title) {
		
		String urlActuel = driver.getCurrentUrl();
		String titleActuel = driver.getTitle();
		
		if(!urlActuel.equals(url)){
			fail("Wrong URL!!!!!!!!!");
		}
		
		if(!titleActuel.contains(title)){
			fail("Title miss match!!!!!!!!!");
		}
	    
	}





}
