package week4.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DynamicParamSF extends BaseClass {

	@DataProvider(name="create")
	public String[][] sendMultipleData() {
		String[][] data=new String[2][1];
		data[0][0]="Salesforce Automation by Dillibabu";
		data[1][0]="Salesforce Automation by QA Team";
		return data;
	}
	@Test(dataProvider = "create")
	public void verifyLegalEntityName(String name) {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		WebElement ele = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		Actions act=new Actions(driver);
		act.scrollToElement(ele).perform();
		ele.click();
		WebElement el = driver.findElement(By.xpath("(//div[contains(@class,'right')])[4]//a/lightning-icon"));
		JavascriptExecutor js = driver;
		js.executeScript("arguments[0].click();", el);
		WebElement el2 = driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
		js.executeScript("arguments[0].click();", el2);
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String createdMsg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		System.out.println(createdMsg);
		String createdName = driver.findElement(By.xpath("(//a[@class='forceActionLink'])[2]/div")).getText();
		System.out.println(createdName);
		if(createdMsg.contains(createdName)) {
			System.out.println("Legal entity is created");
		}else {
			System.out.println("Legal entity is not created");
		}
	}

}
