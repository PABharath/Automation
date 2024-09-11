package Bharath;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testDriven {
	
	@Test(dataProvider="drivendata")
	public void data(String name) {
		System.out.println(name);
		
	}
	
	
	@DataProvider
	@Test
	public Object[][] drivendata() {
		Object[][] data= {{"Hello i am bharath"},{"Hello i am siva"},{"Hello i am bharath"}};
		return data;
	}

}
