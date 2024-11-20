package pages;

import org.openqa.selenium.By;


import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class MyHomePage extends BaseClass {

@And("click on leads link")
public MyLeadsPage clickLeads() {
	getDriver().findElement(By.linkText("Leads")).click();
	return new MyLeadsPage();
	

}
@Given("click on accounts link")
public MyAccountsPage clickAccounts() {
	getDriver().findElement(By.linkText("Accounts")).click();
	return new MyAccountsPage();
}
}
