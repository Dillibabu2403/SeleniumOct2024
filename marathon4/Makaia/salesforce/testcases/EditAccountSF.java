package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPageSF;

public class EditAccountSF extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setvalues() {
		testcaseName = "EditAccountSF";
		testDescription ="Verify edit account functionality in salesforce with positive data";
		authors="DilliBabu";
		category ="Sanity";
		excelFileName="EditAccountSalesforce";
	}
	
	@Test(dataProvider = "fetchData")
	public void runEditAccount(String uname,String pass,String accname,String billAddress,String shipAddress,String ph) {
	LoginPageSF lp=new LoginPageSF();
	lp.enterUsername(uname).enterPassword(pass)
	.clickLoginButton().clickToggleMenu().clickViewAllOption()
    .clickSalesFromAppLauncher()
    .clickAccounts()
    .searchAccountUsingUniqueName(accname)
    .selectEditOption()
    .changeTypeAsTechnologyPartner()
    .changeIndustryAsHealthCare()
    .enterBillingAddress(billAddress)
    .enterShippingAddress(shipAddress)
    .setCustomerPriorityToLow()
    .setSLAOptionToSilver()
    .setActiveToNo()
    .enterUniquePhoneNumber(ph)
    .setUpsellOpportunityToNo()
    .clickSaveButton()
    .verifyPhoneNumber();
    
    
	}
	
	

}
