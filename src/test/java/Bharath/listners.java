package Bharath;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listners implements ITestListener {



@Override

public void onTestSuccess(ITestResult result) {
	
	System.out.println("Suceesfully");
	
}
}