package mavenproject1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	@FindBy(xpath="//*[@id='ui-id-4']")WebElement women;

	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnWoen()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60) );
				wait.until(ExpectedConditions.elementToBeClickable(women));
		women.click();
	}
}
