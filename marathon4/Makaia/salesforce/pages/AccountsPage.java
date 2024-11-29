package com.salesforce.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class AccountsPage extends ProjectSpecificMethods {
	
	 public AccountsPage searchAccountUsingUniqueName(String accname) {
			WebElement ele = locateElement(Locators.XPATH, "//input[@name='Account-search-input']");
			ele.sendKeys(accname);
			ele.sendKeys(Keys.ENTER);
			reportStep("Search option showed the results", "pass");
			return this;
		}
	 
	 public NewAccountPage selectEditOption() {
		 pause(3000);
		 WebElement ele2 = locateElement(Locators.XPATH, "//a[@data-refid='recordId']");
		 clickUsingJs(ele2);
		 WebElement ele3 = locateElement(Locators.XPATH, "(//button[contains(@class,'last')])[2]/lightning-primitive-icon");
		 clickUsingJs(ele3);
		 click(locateElement(Locators.XPATH, "//span[text()='Edit']"));
		 reportStep("Edit option clicked successfully", "pass");
		return new NewAccountPage();
		 
	 }
	

	
    public NewAccountPage clickNewAccount() {
		click(locateElement(Locators.XPATH, "//div[text()='New']"));
		reportStep("New account option is clicked successfully", "pass");
		return new NewAccountPage();
	}
}
