package testCase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class CreateLead extends BaseClass {
	
	@BeforeClass
	public void setValues() {
		Excelfilename="Createlead";
	}
@Test(dataProvider="sendData")
	public void runCreateLead(String uName,String Pwd,String Cname,String Fname,String Lname) {
		LoginPage lp=new LoginPage();
		lp.enterUserName(uName)
		.enterPassword(Pwd)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickCreateLeadbutton()
		.enterCompName(Cname)
		.enterFirstName(Fname)
		.enterLastName(Lname)
		.clickSubmit()
		.VerifyLead();
	}
}
