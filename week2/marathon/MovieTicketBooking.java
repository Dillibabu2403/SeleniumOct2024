package marathon;

import java.time.Duration;
import java.util.concurrent.Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MovieTicketBooking {

	public static void main(String[] args) throws InterruptedException {

		// Initialize the driver and login to the pvr cinemas page
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		//) Click on Cinema under Quick Book
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		//Select Your Cinema
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'INOX Salem Reliance Mall Salem')]")).click();
		//Select Your Date as Tomorrow
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		//Select Your Movie
		driver.findElement(By.xpath("(//span[text()='BLACK'])[2]")).click();
  //Select Your Show Time
		driver.findElement(By.xpath("//span[contains(text(),'10:15')]")).click();
		//Click on Book Button
		driver.findElement(By.xpath("//span[text()='Book']")).click();
		Thread.sleep(5000);
		//Click Accept on Term and Condition
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		Thread.sleep(5000);
		//Click any one available seat
		driver.findElement(By.xpath("(//span[contains(text(),'CLUB')]/parent::div/following-sibling::tr/td)[3]"))
				.click();
		//Print the Seat info under book summary
		String seatNo = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		System.out.println(seatNo);
		//Print the grand total under book summary
		String total = driver.findElement(By.xpath("//div[@class='grand-prices']/h6")).getText();
		System.out.println(total);
       //Click Proceed Button
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(5000);
		//Close the popup
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String ExpTitle = "PVR Cinemas";
		if (title.equals(ExpTitle)) {
			System.out.println("Title Matched");

		} else {
			System.out.println("Title not matched");
		}

	}

}
