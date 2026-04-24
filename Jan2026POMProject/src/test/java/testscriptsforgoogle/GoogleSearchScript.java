package testscriptsforgoogle;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
import webpagesforgooglesearch.SearchPage;
import webpagesforgooglesearch.SearchResultPage;

public class GoogleSearchScript extends SeleniumUtility{

	SearchPage getSearchPage;
	SearchResultPage getSearchResultPage;
	@BeforeTest
	public void precondition() {
		driver=setUp("chrome", "https://www.google.com");
		//initialize all required WebPages
		getSearchPage=new SearchPage(driver);
		getSearchResultPage=new SearchResultPage(driver);
	}
	@Test(priority=1)
	public void testGoogleSearchPage() {
		String expectedTitle="Google";
		String actualTitle=getCurrentTitleOfApplication();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test(priority=2)
	public void testGoogleSearchSuggestions() {
		//enter required text to be searched
		getSearchPage.enterRequiredTextIntoSearchField("selenium with AI");
		//get suggestion count
		int suggestionCount=getSearchPage.getSuggestionList().size();
		Assert.assertEquals(suggestionCount, 10);
	}
	@Test(priority=3)
	public void testGoogleSearchResult() {
		//select required option from suggestion list
		getSearchPage.selectRequiredSuggestionFromList("selenium with AI udemy");
		String actualText=getSearchResultPage.getSelectedTextFromInputField();
		Assert.assertEquals(actualText, "selenium with ai udemy");
	}
	@AfterTest
	public void postCondition() {
		driver.quit();
	}
}
