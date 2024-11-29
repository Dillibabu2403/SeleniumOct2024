package com.salesforce.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class AppLauncherPage extends ProjectSpecificMethods {
	
	public SellerHomePage clickSalesFromAppLauncher() {
		WebElement ele2 = locateElement(Locators.XPATH, "//p[text()='Sales']");
		moveToElement(ele2);
		ele2.click();
        reportStep("Sales option is clicked successfully", "pass");
		return new SellerHomePage();
	}

}
