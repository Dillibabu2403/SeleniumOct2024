package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class RunnerSF {

@CucumberOptions(features = "src/test/java/feature/CreateAccountSalesforce.feature",
                 glue = "stepdefinition")
public class RunnerClass extends AbstractTestNGCucumberTests {

	

}
}