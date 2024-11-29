package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPageSF;

public class CreateAccountSF extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setvalues() {
		testcaseName = "CreateAccountSF";
		testDescription ="Verify create account functionality in salesforce with positive data";
		authors="Dilli";
		category ="Functional";
		excelFileName="CreateAccountSalesforce";
	}
	
	@Test(dataProvider = "fetchData")
	public void runCreateAccount(String uname,String pass,String accname) {
	LoginPageSF lp=new LoginPageSF();
	lp.enterUsername(uname).enterPassword(pass)
	.clickLoginButton().clickToggleMenu().clickViewAllOption()
    .clickSalesFromAppLauncher()
    .clickAccounts()
    .clickNewAccount()
    .enterAccountName(accname)
    .selectOwnershipAsPublic()
    .clickSaveButton()
    .verifyAccountCreated();
	}
	
	

}
