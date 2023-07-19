package execution;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mavenproject1.HomePage;
import qa.DriverFactory;

public class HomePageSteps {
	
	HomePage homepage = new HomePage(DriverFactory.getDriver());
	
	@Given("User is at landing page")
	public void user_is_at_landing_page() {
		WebDriver driver =  DriverFactory.getDriver(); 
		driver.get("https://magento.softwaretestingboard.com/women.html");
	}

	@When("User clicks on women")
	public void user_clicks_on_women() {
	   homepage.clickOnWoen(); 
	}

	@Then("User should navigate to next page")
	public void user_should_navigate_to_next_page() {
	    System.out.println("its done");
	}


}
