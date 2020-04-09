package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumPages.GooglePage;

public class MyTestStepDef {
	
	GooglePage GooglePage = new GooglePage();
	
	@Given("^I launch Chrome  browser$")
	public void i_launch_Chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver.exe");
		GooglePage.launchBrowser();
	}

	@When("^I open Google Homepage$")
	public void i_open_Google_Homepage() throws Throwable {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads");
		GooglePage.openGoogleURL();
	    	}

	@Then("^I verify that the page displays search text box$")
	public void i_verify_that_the_page_displays_search_text_box() throws Throwable {
	    
		GooglePage.checkSearchBoxIsDisplayed();
	}

	@Then("^the page displays Google Search button$")
	public void the_page_displays_Google_Search_button() throws Throwable {
		GooglePage.checkGoogleSearchButtonIsDisplayed();
	    
	}

	@Then("^the page displays I am Feeling Lucky button$")
	public void the_page_displays_I_am_Feeling_Lucky_button() throws Throwable {
	   
		GooglePage.checkImFeelingLuckyButtonIsDisplayed();
	}


}
