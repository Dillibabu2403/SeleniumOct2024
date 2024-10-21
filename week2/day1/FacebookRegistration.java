package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Mark");
		driver.findElement(By.name("lastname")).sendKeys("Zuckerberg");
		WebElement ele1 = driver.findElement(By.id("day"));
		Select sel = new Select(ele1);
		sel.selectByVisibleText("24");
		WebElement ele2 = driver.findElement(By.id("month"));
		Select sel2 = new Select(ele2);
		sel2.selectByIndex(2);
		WebElement ele3 = driver.findElement(By.id("year"));
		Select sel3 = new Select(ele3);
		sel3.selectByValue("1994");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		driver.findElement(By.id("password_step_input")).sendKeys("1234567890");
		

	}

}
