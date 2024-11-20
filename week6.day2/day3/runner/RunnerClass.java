package runner;

import base.BaseClass;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = {"src/test/java/features/Create.feature"},
                 glue = "pages",
                 publish=true,
                 monochrome=true)

public class RunnerClass extends BaseClass {

	

}