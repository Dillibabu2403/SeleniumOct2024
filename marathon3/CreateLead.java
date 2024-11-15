package marathon3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	
	@DataProvider(name="create")
	public String[][] sendMultipleData() {
		String[][] data=new String[2][4];
		data[0][0]="Dilli solutions";
		data[0][1]="Dillibab";
		data[0][2]="RR";
		data[0][3]="1123456789";
		data[1][0]="Testleaf solutions";
		data[1][1]="Dinesh";
		data[1][2]="DB";
		data[1][3]="9822333883";
	    return data;
	}

	@Test(dataProvider = "create")
	public void runCreateLead(String cname,String fname,String lname,String phNo) {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		


	}

}
