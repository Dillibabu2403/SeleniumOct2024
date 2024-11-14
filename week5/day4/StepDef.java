package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef extends BaseClassLeafTaps {
	
	
	@Given("Launch browser")
	public void launch_browser() {
		driver = new ChromeDriver();
	}
	@Given("Load URL")
	public void load_url() {
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Given("enter username as {string}")
	public void enter_username_as_demosalesmanager(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
		
	}

	@Given("enter the password as {string}")
	public void enter_the_password_as_crmsfa(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	@Given("leave the password field empty")
	public void leave_the_password_field_empty() {
	    System.out.println("Password field empty");
	    driver.findElement(By.id("password")).sendKeys("");
	}

	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}

	@Then("verify Welcome page is displayed")
	public void verify_Welcome_page_is_displayed() {
		WebElement ele = driver.findElement(By.xpath("//h2"));
		String text = ele.getText();
		System.out.println(text);
		
		if (text.contains("Welcome")) {
			System.out.println("Welcome page is displayed successfully");
		}
		 
	}
		
	@But("Welcome page is not displayed")
		public void Welcome_page_is_not_displayed() {
			WebElement ele = driver.findElement(By.xpath("//h2"));
			String text = ele.getText();
			System.out.println(text);
			if (text.contains("Welcome")) {
				System.out.println("Welcome page is displayed successfully");
			} else {
				System.out.println("Welcome page is not displayed");
			}
			}
	
	@When("click on crmsfa link")
	public void click_on_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@When("click on leads link")
	public void click_on_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	}

}
