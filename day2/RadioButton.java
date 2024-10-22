package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[text()='Edge']")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		boolean status = driver.findElement(By.xpath("//label[text()='Chennai']")).isSelected();
		System.out.println(status);
		boolean chrome = driver.findElement(By.xpath("(//label[text()='Chrome'])[2]")).isSelected();
		System.out.println(chrome);
		boolean firefox = driver.findElement(By.xpath("(//label[text()='Firefox'])[2]")).isSelected();
		System.out.println(firefox);
		boolean safari = driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).isSelected();
		System.out.println(safari);
		boolean edge = driver.findElement(By.xpath("(//label[text()='Edge'])[2]")).isSelected();
		System.out.println(edge);
		driver.findElement(By.xpath("//label[contains(text(),'20')]")).click();
		
		
	}

}
