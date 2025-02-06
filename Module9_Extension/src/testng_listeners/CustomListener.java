package testng_listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomListener extends TestListenerAdapter {
	
	//override method onTestFailure
	public void onTestFailure(ITestResult tr){
	System.out.println(" Fail - " + tr.getName());	
	}
	
	//override method onTestSkipped
	public void onTestSkipped(ITestResult tr){
	System.out.println(" Skipped - " + tr.getName());	
	}
	
	//override method onTestSkipped
	public void onTestSuccess(ITestResult tr){
	System.out.println(" Success - " + tr.getName());	
	}
	
}
