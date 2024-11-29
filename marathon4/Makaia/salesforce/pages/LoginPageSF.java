package com.salesforce.pages;


import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;


public class LoginPageSF extends ProjectSpecificMethods {

	public LoginPageSF enterUsername(String uname) {
		clearAndType(locateElement(Locators.ID, "username"), uname);
		reportStep(uname+" Username is entered successfully","pass");
		return this;
	}
	
	public LoginPageSF enterPassword(String pwd) {
		clearAndType(locateElement(Locators.ID, "password"), pwd);
		reportStep(pwd+" Password is entered successfully","pass");
		return this;
	}
	
	public HomePage clickLoginButton() {
		click(locateElement(Locators.ID, "Login"));
		reportStep("Login button is clicked successfully", "pass");
		return new HomePage();
	}
	
	
}
