package actions;

import org.openqa.selenium.WebDriver;

import elements.EbayHome_elements;
import steps.ComunSteps;

public class EbayHome_actions {
	
	WebDriver driver;
	
	EbayHome_elements ebayElements;

	public EbayHome_actions(ComunSteps cs) {
		
		this.driver = cs.getdriver();
		
		ebayElements= new EbayHome_elements(driver);
	}
	
	public void clickAdvancedLink() {
		ebayElements.advancedLink.click();
	}
	
	public void searchItem(String searchString) {
		ebayElements.inputSearch.sendKeys(searchString);
	}
	
	

}
