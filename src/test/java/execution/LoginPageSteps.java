package execution;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mavenproject1.LoginPage;
import qa.DriverFactory;

public class LoginPageSteps {
	LoginPage login=new LoginPage(DriverFactory.getDriver());
	@Given("User is at login page")
	public void user_is_at_login_page() {
	    WebDriver driver=DriverFactory.getDriver();
	    driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/");
	}

	@When("User enter username {string}")
	public void user_enter_username(String user) throws InterruptedException {
		Thread.sleep(2000);
	   login.enterUsername(user);
	}

	@When("User enter password {string}")
	public void user_enter_password(String pass) throws InterruptedException {
		Thread.sleep(2000);
	    login.enterPassword(pass);
	}

	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		login.clickOnLogin();
	}

	@Then("User sucessfully login to homepage")
	public void user_sucessfully_login_to_homepage() {
	    System.out.println("its done");
	}


}
