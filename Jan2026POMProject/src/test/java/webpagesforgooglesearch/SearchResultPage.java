package webpagesforgooglesearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class SearchResultPage extends SeleniumUtility{
	public SearchResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//search input field
	@FindBy(name="q")
	private WebElement searchInputField;
	
	public WebElement getSearchInputField() {
		return searchInputField;
	}
	
	public String getSelectedTextFromInputField() {
		return getTextFromElement(searchInputField);
	}
	
}
