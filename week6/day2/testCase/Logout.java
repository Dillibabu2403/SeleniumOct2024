package testCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class Logout extends BaseClass {

	@BeforeTest
	public void setValues() {
		Excelfilename="Login";
	}
	
	@Test(dataProvider = "sendData")
	public void runLogout(String un,String pw) {
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName(un)
		.enterPassword(pw)
		.clickLogin()
		.clickLogout()
		.verifyLoginPage();
	}
	}

