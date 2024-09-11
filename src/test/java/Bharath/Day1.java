package Bharath;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	@Parameters({"URL"})
	@Test
	public void HomeLoan(String url) {
		System.out.println("Starting the process of Home laon");
		System.out.println(url);
	}
	
	@Test(groups="smoke")
	public void takenAmount() {
		System.out.println("With drawal amount");
	}

	@Test
	public void ClosethehomeLoan() {
		System.out.println("close the loan");
	}


}
