package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayHome_elements {
	
	WebDriver driver;
	
	@FindBy(id="gh-as-a")
	public WebElement advancedLink;
	
	@FindBy(id="gh-ac")
	public WebElement inputSearch;
	
	@FindBy(id="gh-btn")
	public WebElement searchBtn;
	
	@FindBy(css="(//h1[@class=\"srp-controls__count-heading\"]/span)[1]")
	public WebElement nbofItems;
	
	@FindBy(css="select#gh-cat>option")
	public WebElement categoryOptions;

	public EbayHome_elements(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

}
