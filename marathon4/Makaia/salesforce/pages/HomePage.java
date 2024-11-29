package com.salesforce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	public HomePage clickToggleMenu() {
		click(locateElement(Locators.XPATH, "//div[@class='slds-icon-waffle']"));
		reportStep("Toggle button is clicked successfully", "pass");
		return this;
	}
	
	public AppLauncherPage clickViewAllOption() {
		click(locateElement(Locators.XPATH, "(//button[@class='slds-button'])[2]"));
		reportStep("View All option is clicked successfully", "pass");
		return new AppLauncherPage();
	}
	
	
	
	

}
