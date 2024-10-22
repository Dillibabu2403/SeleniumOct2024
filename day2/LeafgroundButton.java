package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class LeafgroundButton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String expTitle="Dashboard";
		if(title.equals(expTitle)) {
			System.out.println("Title matched");
		}else {
			System.out.println("Title not matched");
		}
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[text()='Button']")).click();
		boolean status = driver.findElement(By.xpath("//button[@disabled='disabled']")).isEnabled();
		System.out.println(status);
		WebElement ele = driver.findElement(By.xpath("(//h5[contains(text(),'position')]/following-sibling::button//span)[2]"));
		Point location = ele.getLocation();
		System.out.println(location);
		WebElement el2 = driver.findElement(By.xpath("//h5[contains(text(),'Save')]/following-sibling::button"));
		String btnColour = el2.getCssValue("background-color");
		System.out.println(btnColour);
		String hex = Color.fromString(btnColour).asHex();
		System.out.println(hex);
		WebElement ele3 = driver.findElement(By.xpath("//h5[contains(text(),'height')]/following-sibling::button"));
		Dimension size = ele3.getSize();
		System.out.println(size);
		driver.close();
		
		
	}

}
