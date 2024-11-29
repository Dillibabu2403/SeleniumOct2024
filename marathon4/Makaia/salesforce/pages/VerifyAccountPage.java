package com.salesforce.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class VerifyAccountPage extends ProjectSpecificMethods {
	
	public VerifyAccountPage verifyAccountCreated() {
		String accName = locateElement(Locators.XPATH, "//slot[@name='primaryField']//lightning-formatted-text").getText();
		 if(accName.contains("Makaia")) {
		    	System.out.println("Account created successfully: "+accName);	
		    }else {
		    	System.out.println("Account not created");
		    }
		reportStep("Account option is clicked successfully", "pass");
		return this;
	}
	
	public VerifyAccountPage verifyPhoneNumber() {
		String displayedPhoneNo = locateElement(Locators.XPATH, "//p[text()='Phone']/following-sibling::p").getText();
		System.out.println(displayedPhoneNo);
		String ExpPhneNo="1122334455";
		if(displayedPhoneNo.equals(ExpPhneNo)) {
			System.out.println("Entered phone number is matched");
		}else {
			System.out.println("Entered phone number is not matched");
		}
		reportStep("Phone number verified successfully", "pass");
		return this;
		
	}

}
