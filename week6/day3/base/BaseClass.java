package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass extends AbstractTestNGCucumberTests {

	public String Excelfilename;

	@DataProvider
	public String[][] sendData() throws IOException {
		return utils.ExcelIntegration.readExcelData(Excelfilename);

	}

	private static final ThreadLocal<RemoteWebDriver> tl = new ThreadLocal<RemoteWebDriver>();

	public void setDriver() {
		tl.set(new ChromeDriver());
	}

	public RemoteWebDriver getDriver() {
		return tl.get();
	}

	@BeforeMethod
	public void preConditions() {
		setDriver();
		getDriver().manage().window().maximize();
		getDriver().get("http://leaftaps.com/opentaps/control/main");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@AfterMethod
	public void postConditions() {
		getDriver().close();

	}

}
