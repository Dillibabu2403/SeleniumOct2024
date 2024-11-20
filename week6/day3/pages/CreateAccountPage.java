package pages;

import org.openqa.selenium.By;


import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateAccountPage extends BaseClass {
	
	@And("enter the account name as (.*)$")
public CreateAccountPage enterAccountName(String aname) {
		getDriver().findElement(By.id("accountName")).sendKeys(aname);
		return this;
		
	}
	@When("click on the create account button")
	public AccountDetailsPage clickAccountSubmit() {
		getDriver().findElement(By.className("smallSubmit")).click();
		return new AccountDetailsPage();
	}
}
