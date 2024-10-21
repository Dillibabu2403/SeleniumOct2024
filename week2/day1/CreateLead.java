package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("DBSelenium");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dilli");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Babu");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("View Lead | opentaps CRM")) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Not matched");
		}
		driver.close();

	}

}
