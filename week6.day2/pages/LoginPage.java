package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public LoginPage enterUserName(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
		return this;
	}
	public LoginPage enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
		return this;
	}
	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}
	
	public LoginPage verifyLoginPage() {
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Leaftaps - TestLeaf Automation Platform")) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Not matched");
	}
		return this;
	}
	}
	
	


