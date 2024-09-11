package Bharath;

import org.testng.annotations.Test;

public class Day2 {
	@Test
	public void loginapp() {
		System.out.println("Login in the application");
	}
	@Test(groups="smoke")
	public void Search() {
		System.out.println("search in the application");
	}
	@Test
	public void logoutapp() {
		System.out.println("logout of the application");
	}

}
