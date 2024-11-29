package com.salesforce.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class SellerHomePage extends ProjectSpecificMethods {
	
	public AccountsPage clickAccounts() {
		WebElement ele2 = locateElement(Locators.XPATH, "//span[text()='Accounts']");
		clickUsingJs(ele2);
		reportStep("Account option is clicked successfully", "pass");
		return new AccountsPage();
	}
	
 
	
	
	
	

}
