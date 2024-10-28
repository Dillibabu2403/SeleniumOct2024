package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(text(),'Fashion')]")).click();
		String totalItems = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(totalItems);
		List<WebElement> brandNames = driver.findElements(By.xpath("//div[@class='brand']"));
		List<WebElement> bagNames = driver.findElements(By.xpath("//div[@class='nameCls']"));
		List<String>list=new ArrayList<String>();
		for(WebElement we:brandNames) {
			String text = we.getText();
			list.add(text);
		}
		System.out.println(list);
		List<String>list2=new ArrayList<String>();
		for(WebElement ws:bagNames) {
			String text2 = ws.getText();
			list2.add(text2);
		}
		
		System.out.println(list2);
		

	}

}
