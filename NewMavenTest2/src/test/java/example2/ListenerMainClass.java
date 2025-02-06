package example2;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

// interface ITestListener

public class ListenerMainClass implements ITestListener{
 /*
  *  @Test
  public void f() {
	  
  }
*/
@Override
public void onFinish(ITestContext arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onStart(ITestContext arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestFailure(ITestResult arg0) {
	// TODO Auto-generated method stub
	System.out.println("Testcase failed " + arg0.getName() + arg0.getTestClass());
	System.out.println("Error message for testcase " + arg0.getThrowable());
}

@Override
public void onTestSkipped(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestStart(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestSuccess(ITestResult arg0) {
	// TODO Auto-generated method stub
	System.out.println(" Testcase Passed " + arg0.getName() + arg0.getTestClass());
	//System.out.println("Error message for testcase " + arg0.getThrowable());
}
}
