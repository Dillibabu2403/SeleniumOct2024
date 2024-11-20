package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateAccountPage extends BaseClass {
	
	public CreateAccountPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreateAccountPage enterAccountName(String aname) {
		driver.findElement(By.id("accountName")).sendKeys(aname);
		return this;
	}
	
	public AccountDetailsPage clickAccountSubmit() {
		driver.findElement(By.className("smallSubmit")).click();
		return new AccountDetailsPage(driver);
	}
}
