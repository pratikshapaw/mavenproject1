package execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"src\\test\\resources\\feature\\LoginPage.feature"},
		glue= {"execution"},
				plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
		
		
		)


public class LoginPageRunner extends AbstractTestNGCucumberTests{

}
