package pages;

import base.BaseClass;
import io.cucumber.java.en.Then;

public class ViewLeadPage extends BaseClass {
	
	@Then("verify the lead is created")
	public ViewLeadPage VerifyLead() {
		String title = getDriver().getTitle();
		System.out.println(title);
		if (title.equals("View Lead | opentaps CRM")) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Not matched");
	}
		return this;
}
}
