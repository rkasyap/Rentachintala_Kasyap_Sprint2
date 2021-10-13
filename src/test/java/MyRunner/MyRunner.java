package MyRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features={"./src/test/java/Features"},
	glue = "StepDefinition"
	
)
public class MyRunner extends  AbstractTestNGCucumberTests {

	
}