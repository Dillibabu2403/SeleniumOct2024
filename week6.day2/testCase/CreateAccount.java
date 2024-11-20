package testCase;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class CreateAccount extends BaseClass {
	
	@BeforeTest
	public void setValues() {
		Excelfilename="Login";
		Excelfilename="CreateAccount";
	}
	
@Test(dataProvider="sendData")
	public void runCreateAccount(String uName,String Pwd,String aname) {
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName(uName)
		.enterPassword(Pwd)
		.clickLogin()
		.clickCrmsfa()
		.clickAccounts()
		.clickCreateAccountbutton()
		.enterAccountName(aname)
		.clickAccountSubmit()
		.verifyAccountDetailsPage();
	}
}

