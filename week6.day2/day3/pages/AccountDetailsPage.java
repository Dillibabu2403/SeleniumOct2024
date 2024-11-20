package pages;



import base.BaseClass;
import io.cucumber.java.en.Then;

public class AccountDetailsPage extends BaseClass {

	@Then("verify the account is created")
	public AccountDetailsPage verifyAccountDetailsPage() {
		String title = getDriver().getTitle();
		System.out.println(title);
		if (title.equals("Account Details | opentaps CRM")) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Not matched");
	}
		return this;
	}
}
