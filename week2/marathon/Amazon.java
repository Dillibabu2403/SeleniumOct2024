package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// Initialize the driver and login to the amazon page
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Type "Bags for boys" in the Search box
		WebElement ele = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		ele.sendKeys("Bags for boys");
		//Choose the      item in the result (bags for boys)
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//Print the total number of results (like 50000)
		   //example like this-----> 1-48 of over 50,000 results for "bags for boys"
		String text = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"))
				.getText();
		System.out.println(text);
		Thread.sleep(3000);
		//Select the first 2 brands in the left menu
	    //(like American Tourister, Generic)
		driver.findElement(By.xpath("(//div[contains(@class,'fancy')])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(@class,'fancy')])[2]/following-sibling::span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		//Choose New Arrivals (Sort)
		driver.findElement(By.xpath("//a[contains(text(),'Newest')]")).click();
		Thread.sleep(3000);
		//Print the first resulting bag info (name, discounted price)
		String firstResultingName = driver.findElement(By.xpath("(//h2[contains(@class,'clamp')])[2]")).getText();
		System.out.println(firstResultingName);
		String discountedPrice = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println(discountedPrice);
		//Get the page title and close the browser(driver.close())
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		driver.close();

	}

}
