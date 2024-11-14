package stepdefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeadSteps extends BaseClassLeafTaps {

	@When("click on createlink lead")
	public void click_on_createlink_lead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@Given("enter the company name as (.*)$")
	public void enter_the_company_name_as_testleaf(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	}

	@Given("enter the firstname (.*)$")
	public void enter_the_firstname_saranya(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}

	@Given("enter the last name (.*)$")
	public void enter_the_last_name_s(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}

	@When("click on the create lead button")
	public void click_on_the_create_lead_button() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("verify the lead is created")
	public void verify_the_lead_is_created() {
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("View Lead | opentaps CRM")) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Not matched");
		}
	}

	@Given("Click on Find leads link")
	public void findLeadsLink() {
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@And("Click on Phone tab")
	public void phoneTab() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}

	@And("Enter phone number as (.*)$")
	public void phoneNumber(String phn) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).clear();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phn);
	}

	@And("Click on Find Leads button")
	public void findLeadsButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}

	@And("Select the lead from the list")
	public void selectLead() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@And("Click on edit option")
	public void clickEditOption() {
		driver.findElement(By.linkText("Edit")).click();
	}

	@And("Update the company name as (.*)$")
	public void updateCompanyName(String ccn) {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(ccn);
	}

	@When("Click on Update button")
	public void clickUpdateButton() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("Verify the details are updated")
	public void verifyUpdatedDetails() {
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("View Lead | opentaps CRM")) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Not matched");
		}
	}
	
	@When("Click on delete option")
	public void clickDeleteButton() {
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
	}
	@Then("Verify the lead is deleted")
	public void verifyDeletedLead() {
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("View Lead | opentaps CRM")) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Not matched");
		}
	}
}
