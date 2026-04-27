package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;

public class GoogleSearchStepDef extends SeleniumUtility{

	@Given("user is already on google search page")
	public void user_is_already_on_google_search_page() {
	    setUp("chrome", "https://www.google.com");
	    
	}

	@When("^user enters (.+) into search input field$")
	public void user_enters_into_search_input_field(String input) {
	    typeInput(driver.findElement(By.name("q")), input);
	    
	}
	
	@And("press enter button")
	public void  press_enter_button() {
		getActitveElement().sendKeys(Keys.ENTER);
	}

	@Then("^user should be able to see search result page with page title having (.+)$")
	public void user_should_be_able_to_see_search_result_page_with_page_title_having(String expectedTitle) {
	    
	   String actualTitle= getCurrentTitleOfApplication();
	   Assert.assertTrue(actualTitle.contains(expectedTitle));
	}
}
