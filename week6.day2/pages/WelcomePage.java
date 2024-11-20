package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class WelcomePage extends BaseClass {
	public WelcomePage(ChromeDriver driver) {
		this.driver=driver;
	}
public MyHomePage clickCrmsfa() {
	driver.findElement(By.linkText("CRM/SFA")).click();
	return new MyHomePage(driver);
}

public LoginPage clickLogout() {
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	return new LoginPage(driver);
}
}
