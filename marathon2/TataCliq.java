package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TataCliq {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//Initializing Edge driver
		EdgeDriver driver = new EdgeDriver();
		
		//1. Load the url as https://www.tatacliq.com/

		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Yes, I’m In']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//2. MouseHover on 'Brands'

		WebElement brands = driver.findElement(By.xpath("(//div[@class='DesktopHeader__arrow'])[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(brands).perform();
		
		//3. MouseHover on 'Watches & Accessories'

		WebElement watch = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		act.moveToElement(watch).perform();
		
		//4. Choose the first option from the 'Featured brands'.

		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		
		//5. Select sortby: New Arrivals

		WebElement el1 = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select sel=new Select(el1);
		sel.selectByVisibleText("New Arrivals");
		
		//6. choose men from catagories filter.

		driver.findElement(By.xpath("//div[text()='Men']")).click();
		Thread.sleep(3000);
		
		//7. print all price of watches

		List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
		String price = driver.findElement(By.xpath("//div[@class='ProductDescription__priceHolder']")).getText();
		System.out.println("Product price is :"+price);
		System.out.println("-------------------------------------------------------------------");
		for (WebElement we : priceList) {
			System.out.println(we.getText());
		}
		Thread.sleep(3000);
		
		//8. click on the first resulting watch

		WebElement ss = driver.findElement(By.xpath("//div[@class='ProductDescription__header']"));
		JavascriptExecutor js = driver;
		js.executeScript("arguments[0].click();", ss);
		Set<String> watches = driver.getWindowHandles();
		List<String> ls = new ArrayList(watches);
		driver.switchTo().window(ls.get(1));
		String displayedPrice = driver.findElement(By.xpath("//h3")).getText();
		String replace = displayedPrice.replace("MRP: ","");
		System.out.println("-------------------------------------");
		System.out.println(replace);
		
		//10. compare two price are similar
		if(price.equals(replace)) {
		    	System.out.println("Price matched");
		    }else {
		    	System.out.println("Price is not matched");
		    }
		//9. click Add to Bag   and  get count from the Bag cart icon
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		

		String totalCount = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println(totalCount);
		
		//11. Click on the Bag cart icon

		driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).click();

		
		//12. Take a snap of the resulting page. 

	    File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/watches.png");
		FileUtils.copyFile(src, dest);
		
		//13. Close All the opened windows one by one.
		driver.close();
		driver.switchTo().window(ls.get(0)).close();
		
		
		
		
	}

}
