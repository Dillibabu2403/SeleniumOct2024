package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/feature/Leads.feature",
                 glue = {"stepdefinition","hooksimplementation"},
                 publish=true,
                 monochrome=true)

public class RunnerClass extends AbstractTestNGCucumberTests {

	

}
