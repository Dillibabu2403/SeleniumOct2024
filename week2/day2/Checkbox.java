package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		System.out.println(text);
		String expResult = "Checked";
		if (text.equals(expResult)) {
			System.out.println("Result matched");
		} else {
			System.out.println("Result not matched");
		}
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ']/parent::div")).click();
		Thread.sleep(3000);
		String text2 = driver.findElement(By.xpath("//span[contains(text(),'State')]")).getText();
		System.out.println(text2);
		String triStateMsg = "State has been changed.";
		if (text2.equals(triStateMsg)) {
			System.out.println("Message matched");
		} else {
			System.out.println("Message not matched");
		}
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		Thread.sleep(3000);
		String text3 = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		System.out.println(text3);
		String toggleMsg = "Checked";
		if (text3.equals(toggleMsg)) {
			System.out.println("Message matched");
		} else {
			System.out.println("Message not matched");
		}
		boolean status = driver.findElement(By.xpath("//input[@disabled='disabled']")).isEnabled();
		System.out.println(status);
		driver.findElement(By.xpath("(//h5[text()='Select Multiple']/following-sibling::div/div)[3]")).click();
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Berlin'])[2]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'close')]")).click();
		driver.close();

	}

}
