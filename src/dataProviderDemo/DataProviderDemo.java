package dataProviderDemo;
import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;

public class DataProviderDemo {
	@Test(dataProvider = "getData")
	public void dataProviderTest(String username,String password) {
		System.out.println(username);
		System.out.println(password);
		
	}
	
	
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data=new Object[3][2]; // Multi dimentional object array
		
		// First data
		data[0][0]="F username";
		data[0][1]="F password";
		
		// Second data
		data[1][0]="S username";
		data[1][1]="S password";
		
		//Third data
		data[2][0]="T Username";
		data[2][1]="T password";
		
		
		
		return data;
	}

}
