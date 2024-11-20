package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateLeadPage extends BaseClass {
	
	@And("enter the company name as (.*)$")
	public CreateLeadPage enterCompName(String cname) {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		return this;
		
	}
	@And("enter the firstname (.*)$")
	public CreateLeadPage enterFirstName(String fname) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
		
	}
	@And("enter the last name (.*)$")
	public CreateLeadPage enterLastName(String lname) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lname);	
		return this;
		
	}
	@When("click on the create lead button")
	public ViewLeadPage clickSubmit() {
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
		
	}
	
		
		
		
	}

