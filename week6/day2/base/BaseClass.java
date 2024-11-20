package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;


public class BaseClass {
public ChromeDriver driver;
public String Excelfilename;

@DataProvider
public String[][] sendData() throws IOException {
	return utils.ExcelIntegration.readExcelData(Excelfilename);
	
}
@BeforeMethod
public void preConditions() {
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

@AfterMethod
public void postConditions() {
	driver.close();
	
}

}
