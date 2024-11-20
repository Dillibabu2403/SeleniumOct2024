package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.Given;

public class MyLeadsPage extends BaseClass {
	
	@Given("click on createlead link")
	public CreateLeadPage clickCreateLeadbutton() {
		getDriver().findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}
}
