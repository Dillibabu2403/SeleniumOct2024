package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParamSFSteps extends BaseClass {
	
	@When("Search for the account using your unique account name")
	public void search_for_the_account_using_your_unique_account_name() {
		WebElement acc = driver.findElement(By.xpath("//input[@name='Account-search-input']"));
		acc.sendKeys("Dilli");
		acc.sendKeys(Keys.ENTER);
	}

	@When("Click the dropdown icon next to the account and select Edit")
	public void click_the_dropdown_icon_next_to_the_account_and_select_edit() {
		WebElement el2 = driver.findElement(By.xpath("//a[@data-refid='recordId']"));
		js = driver;
		js.executeScript("arguments[0].click();", el2);
		WebElement el3 = driver.findElement(By.xpath("(//button[contains(@class,'last')])[2]/lightning-primitive-icon"));
		js.executeScript("arguments[0].click();", el3);
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
	}

	@When("Set Type to Technology Partner")
	public void set_type_to_technology_partner() {
		WebElement el4 = driver.findElement(By.xpath("(//button[contains(@class,'combobox')])[3]/span"));
		js = driver;
		js.executeScript("arguments[0].click();", el4);
        driver.findElement(By.xpath("//span[text()='Technology Partner']")).click();
	}

	@When("Set Industry to Healthcare")
	public void set_industry_to_healthcare() {
		  WebElement el5 = driver.findElement(By.xpath("(//button[contains(@class,'combobox')])[5]/span"));
		    js = driver;
			js.executeScript("arguments[0].click();", el5);
	        WebElement el7 = driver.findElement(By.xpath("//span[text()='Healthcare']"));
	        act=new Actions(driver);
	        act.scrollToElement(el7).perform();
	        el7.click();
	}

	@When("Enter the Billing Address as {string}")
	public void enter_the_billing_address_as(String billAddress) {
		WebElement sk = driver.findElement(By.xpath("//textarea[@class='slds-textarea']"));
        sk.clear();
        sk.sendKeys(billAddress);
	}

	@When("Enter the Shipping Address as {string}")
	public void enter_the_shipping_address_as(String shippingAddress) {
		WebElement sk2 = driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]"));
        sk2.clear();
        sk2.sendKeys(shippingAddress);
	}

	@When("Set Customer Priority to Low")
	public void set_customer_priority_to_low() {
		WebElement el6 = driver.findElement(By.xpath("(//button[contains(@class,'combobox')])[6]/span"));
		js = driver;
		js.executeScript("arguments[0].click();", el6);
		driver.findElement(By.xpath("//span[text()='Low']")).click();
	}

	@When("Set SLA to Silver")
	public void set_sla_to_silver() {
		WebElement el8 = driver.findElement(By.xpath("(//button[contains(@class,'combobox')])[7]/span"));
		js = driver;
		js.executeScript("arguments[0].click();", el8);
		driver.findElement(By.xpath("//span[text()='Silver']")).click();
	}

	@When("Set Active to NO")
	public void set_active_to_no() {
		WebElement el9 = driver.findElement(By.xpath("(//button[contains(@class,'combobox')])[9]/span"));
		js = driver;
		js.executeScript("arguments[0].click();", el9);
		driver.findElement(By.xpath("//span[text()='No']")).click();
	}

	@When("Enter a unique number in the Phone field as {string}")
	public void enter_a_unique_number_in_the_phone_field_as(String phNo) {
		WebElement ph = driver.findElement(By.xpath("//input[@name='Phone']"));
		ph.clear();
		ph.sendKeys(phNo);
	}

	@When("Set Upsell Opportunity to No")
	public void set_upsell_opportunity_to_no() {
		WebElement el0 = driver.findElement(By.xpath("(//button[contains(@class,'combobox')])[8]/span"));
		js = driver;
		js.executeScript("arguments[0].click();", el0);
		driver.findElement(By.xpath("//span[text()='No']")).click();
	}

	@When("Click Save")
	public void click_save() {
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	}

	@Then("verify the phone number")
	public void verify_the_phone_number() {
		String displayedPhoneNo = driver.findElement(By.xpath("//p[text()='Phone']/following-sibling::p")).getText();
		System.out.println(displayedPhoneNo);
		String ExpPhneNo="1122334455";
		if(displayedPhoneNo.equals(ExpPhneNo)) {
			System.out.println("Entered phone number is matched");
		}else {
			System.out.println("Entered phone number is not matched");
		}
	}


}
