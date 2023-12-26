package mavenproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	 WebDriver driver;
	@FindBy(xpath="//*[@id='email']")WebElement username;
	@FindBy(xpath="(//*[@type='password'])[1]") WebElement password;
	@FindBy(xpath="(//*[text()='Sign In'])[1]") WebElement loginbutton;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	public void enterUsername(String user)
	{
		username.sendKeys(user);;
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);;
	}
	
	public void clickOnLogin()
	{
		loginbutton.click();
	}

}
