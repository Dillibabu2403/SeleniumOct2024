package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;

public class WelcomePage extends BaseClass {

	@And("click on crmsfa link")
	public MyHomePage clickCrmsfa() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}

	public LoginPage clickLogout() {
		getDriver().findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		return new LoginPage();

	}
}
