package com.salesforce.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class NewAccountPage extends ProjectSpecificMethods {
	
	public NewAccountPage enterAccountName(String aName) {
		clearAndType(locateElement(Locators.XPATH, "(//input[@class='slds-input'])[5]"), aName);
		reportStep("Account name entered successfully", "pass");
		return this;
	}
	
	public NewAccountPage selectOwnershipAsPublic() {
		WebElement ele3 = locateElement(Locators.XPATH, "(//span[text()='--None--'])[3]");
		clickUsingJs(ele3);
		click(locateElement(Locators.XPATH, "//span[text()='Public']"));
		reportStep("Public option is selected from Ownership", "pass");
		return this;
	}
	
	public NewAccountPage changeTypeAsTechnologyPartner() {
		WebElement ele4 = locateElement(Locators.XPATH, "(//button[contains(@class,'combobox')])[3]/span");
		clickUsingJs(ele4);
		click(locateElement(Locators.XPATH, "//span[text()='Technology Partner']"));
		reportStep("Type selected successfully", "pass");
		return this;
		
	}
	
	public NewAccountPage changeIndustryAsHealthCare() {
		WebElement ele5 = locateElement(Locators.XPATH, "(//button[contains(@class,'combobox')])[5]/span");
		clickUsingJs(ele5);
		WebElement ele6 = locateElement(Locators.XPATH, "//span[text()='Healthcare']");
		act.scrollToElement(ele6).perform();
		ele6.click();
		reportStep("Industry selected successfully", "pass");
		return this;
		
	}
	
	public NewAccountPage enterBillingAddress(String billAddress) {
		clearAndType(locateElement(Locators.XPATH, "//textarea[@class='slds-textarea']"), billAddress);
		reportStep("Billing Address entered successfully", "pass");
		return this;
		
	}
	
	public NewAccountPage enterShippingAddress(String shipAddress) {
		clearAndType(locateElement(Locators.XPATH, "(//textarea[@class='slds-textarea'])[2]"), shipAddress);
		reportStep("Shipping Address entered successfully", "pass");
		return this;
		
	}
	
	public NewAccountPage setCustomerPriorityToLow() {
		WebElement ele7 = locateElement(Locators.XPATH, "(//button[contains(@class,'combobox')])[6]/span");
		clickUsingJs(ele7);
		click(locateElement(Locators.XPATH, "//span[text()='Low']"));
		reportStep("Customer Priority selected successfully", "pass");
		return this;
		
	}
	
	public NewAccountPage setSLAOptionToSilver() {
		WebElement ele8 = locateElement(Locators.XPATH, "(//button[contains(@class,'combobox')])[7]/span");
		clickUsingJs(ele8);
		click(locateElement(Locators.XPATH, "//span[text()='Silver']"));
		reportStep("set sla option selected successfully", "pass");
		return this;
		
	}
	
	public NewAccountPage setActiveToNo() {
		WebElement ele9 = locateElement(Locators.XPATH, "(//button[contains(@class,'combobox')])[9]/span");
		clickUsingJs(ele9);
		click(locateElement(Locators.XPATH, "//span[text()='No']"));
		reportStep("set active selected successfully", "pass");
		return this;
		
	}
	
	public NewAccountPage enterUniquePhoneNumber(String phoneNo) {
		clearAndType(locateElement(Locators.XPATH, "//input[@name='Phone']"), phoneNo);
		reportStep("Phone number entered successfully", "pass");
		return this;
		
	}
	
	public NewAccountPage setUpsellOpportunityToNo() {
		WebElement elee = locateElement(Locators.XPATH, "(//button[contains(@class,'combobox')])[8]/span");
		clickUsingJs(elee);
		click(locateElement(Locators.XPATH, "//span[text()='No']"));
		reportStep("Upsell opportunity selected successfully", "pass");
		return this;
		
	}
	
	public VerifyAccountPage clickSaveButton() {
		click(locateElement(Locators.XPATH, "(//button[text()='Save'])[2]"));
		reportStep("Save option is clicked succesfully", "pass");
		return new VerifyAccountPage();
	}

}
