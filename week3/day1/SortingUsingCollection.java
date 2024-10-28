package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] arr= {"HCL","Wipro","Aspire Systems","CTS"};
		List<String> companyNames = new ArrayList<String>(Arrays.asList(arr));
		Collections.sort(companyNames);
        for (String s : companyNames) 
        { 
        System.out.println(s); 
        }

	}

}
