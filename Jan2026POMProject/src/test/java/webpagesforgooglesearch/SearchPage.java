package webpagesforgooglesearch;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;
public class SearchPage extends SeleniumUtility{
	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//search input field
	@FindBy(name="q")
	private WebElement searchInputField;
	
	//suggestion list
	@FindBy(css="ul.G43f7e>li>div>div:nth-of-type(2)>*:first-child>*:first-child>span")
	private List<WebElement> suggestionList;

	public WebElement getSearchInputField() {
		return searchInputField;
	}
	public List<WebElement> getSuggestionList() {
		return suggestionList;
	}
	
	public void enterRequiredTextIntoSearchField(String input) {
		typeInput(searchInputField, input);
	}
	
	public void selectRequiredSuggestionFromList(String input) {
		
		for(int i=0;i<suggestionList.size();i++) {
			WebElement suggestion=suggestionList.get(i);
			if(getTextFromElement(suggestion).equalsIgnoreCase(input)){
				clickOnElement(suggestion);
				break;
			}
		}
	}
	
}
