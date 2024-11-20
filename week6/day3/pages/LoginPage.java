package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginPage extends BaseClass {
	
	@And("enter username as {string}")
	public LoginPage enterUserName(String uname) {
		getDriver().findElement(By.id("username")).sendKeys(uname);
		return this;
		
	}
	@And("enter the password as {string}")
	public LoginPage enterPassword(String pwd) {
		getDriver().findElement(By.id("password")).sendKeys(pwd);
		return this;
	}
	@When("click on login button")
	public WelcomePage clickLogin() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}
	@Then("verify Welcome page is displayed")
	public LoginPage verify_Welcome_page_is_displayed() {
		WebElement ele = getDriver().findElement(By.xpath("//h2"));
		String text = ele.getText();
		System.out.println(text);
		
		if (text.contains("Welcome")) {
			System.out.println("Welcome page is displayed successfully");
		}
		return this;
		 
	}
	
	public LoginPage verifyLoginPage() {
		String title = getDriver().getTitle();
		System.out.println(title);
		if (title.equals("Leaftaps - TestLeaf Automation Platform")) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Not matched");
	}
		return this;
	
	}
	}
	
	


