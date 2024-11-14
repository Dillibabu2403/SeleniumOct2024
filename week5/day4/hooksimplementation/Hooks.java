package hooksimplementation;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import stepdefinition.BaseClass;
import stepdefinition.BaseClassLeafTaps;

public class Hooks extends BaseClassLeafTaps {
	
	@Before
	public void preCondition() {
		driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@After
	public void postCondition() {
		driver.close();
	}

}
