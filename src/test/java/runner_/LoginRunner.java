package runner_;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"G:\\spring-tool\\sts-4.21.0.RELEASE\\TestNGCucumber_Form\\src\\test\\resources\\LoginForm\\loginform.feature"},
		glue = "Stepdef"
		)
public class LoginRunner extends AbstractTestNGCucumberTests {

}
