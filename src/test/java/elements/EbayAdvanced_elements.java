package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayAdvanced_elements {

	WebDriver driver;

	@FindBy(id = "gh-la")
	public WebElement ebayLogo;

	@FindBy(id = "_nkw")
	public WebElement searchKeyword;

	@FindBy(id = "_ex_kw")
	public WebElement excludeString;

	@FindBy(id = "_udlo")
	public WebElement minPrice;

	@FindBy(id = "_udhi")
	public WebElement maxPrice;

	@FindBy(id = "searchBtnLowerLnk")
	public WebElement searchBtn;

	public EbayAdvanced_elements(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
