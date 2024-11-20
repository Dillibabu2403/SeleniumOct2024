package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class AccountDetailsPage extends BaseClass {

	public AccountDetailsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public AccountDetailsPage verifyAccountDetailsPage() {
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Account Details | opentaps CRM")) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Not matched");
	}
		return this;
	}
}
