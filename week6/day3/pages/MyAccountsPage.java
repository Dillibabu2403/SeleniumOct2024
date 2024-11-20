package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;

public class MyAccountsPage extends BaseClass {
	@And("click on createaccount link")
	public CreateAccountPage clickCreateAccountbutton() {
		getDriver().findElement(By.linkText("Create Account")).click();
		return new CreateAccountPage();
		
	}
	
}
