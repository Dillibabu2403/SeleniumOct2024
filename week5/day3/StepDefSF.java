package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

     public class StepDefSF extends BaseClass {
    	
 
			@Given("User navigates to the salesforce website")
			public void user_navigates_to_the_salesforce_website() {
				ChromeOptions option=new ChromeOptions();
				option.addArguments("--disable-notifications");
				driver = new ChromeDriver(option);
				driver.get("https://login.salesforce.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			}

			@Given("enter the username for salesforce as {string}")
			public void enter_the_username_as_vidyar_testleaf_com(String uname) {
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uname);
			}

			@Given("enter the password for salesforce as {string}")
			public void enter_the_password_as_sales(String pwd) {
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
			}

		@Given("Click on salesforce Login button")
        public void click_on_login_button() {
			driver.findElement(By.xpath("//input[@id='Login']")).click();
		}
		
			@Given("Click on toggle menu button from the left corner")
			public void click_on_toggle_menu_button_from_the_left_corner() {
				driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
			}

			@Given("Click view All and click Sales from App Launcher")
			public void click_view_all_and_click_sales_from_app_launcher() throws InterruptedException {
				driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
				WebElement ele = driver.findElement(By.xpath("//p[text()='Sales']"));
				act=new Actions(driver);
				act.scrollToElement(ele).perform();
				ele.click();
				
			}

			@Given("Click on Accounts tab")
			public void click_on_accounts_tab() {
				WebElement accountsTab = driver.findElement(By.xpath("//span[text()='Accounts']"));
				driver.executeScript("arguments[0].click()",accountsTab);
			}

			@Given("Click on New button")
			public void click_on_new_button() {
				driver.findElement(By.xpath("//div[text()='New']")).click();
			}

			@Given("Enter your name as (.*)$")
			public void enter_your_name_as_account_name(String accName) {
				driver.findElement(By.xpath("(//input[@class='slds-input'])[5]")).sendKeys(accName);
			}

			@Given("Select Ownership as Public")
			public void select_ownership_as_public() {
				WebElement el3 = driver.findElement(By.xpath("(//span[text()='--None--'])[3]"));
				js = driver;
				js.executeScript("arguments[0].click();", el3);
				driver.findElement(By.xpath("//span[text()='Public']")).click();
			}

			@When("Click on save button")
			public void click_on_save_button() {
				driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
			}

			@Then("verify the Account should be created successfully")
			public void account_should_be_created_successfully() {
				String text = driver.findElement(By.xpath("//slot[@name='primaryField']//lightning-formatted-text")).getText();
			    if(text.equalsIgnoreCase("TestCucumber")||text.equalsIgnoreCase("BabuDB")) {
			    	System.out.println("Account created successfully: "+text);	
			    }else {
			    	System.out.println("Account not created");
			    }
			}
		}
