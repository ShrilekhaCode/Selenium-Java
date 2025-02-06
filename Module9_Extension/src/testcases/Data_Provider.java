package testcases;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Data_Provider {

	@DataProvider(name="regtestDataPRovider")
	public static Object[][] getData(){
		Object data[][] = new Object[2][3];
		data[0][0] = "U1";
		data[0][1] = "P1";
		data[0][2] = "xyz@gmail.com";
		data[1][0] = "U2";
		data[1][1] = "P2";
		data[1][2] = "xyz1@gmail.com";
		return data;	
	}
	
	@DataProvider(name="logintestDataPRovider")
	public static Object[][] getLoginData(){
		Object data[][] = new Object[2][2]; 
/* rows 2, col 2, no of parameters in method call in SampleTest.java = no of columns 
 no of times the testcase in SampleTest.java will run is = no. of rows of Object 
 returned from datarpovider, this you can see in run result in console */
		data[0][0] = "U3";
		data[0][1] = "P3";
		
		data[1][0] = "U4";
		data[1][1] = "P4";
		return data;	
	}
	
	@DataProvider(name="samplePRovider")
	public static Object[][] xyzData(Method m){
		Object data[][] = null; 
		
		if(m.getName().equals("testA")){
		data = new Object [2][2];
		data[0][0] = "U5";
		data[0][1] = "P5";
		
		data[1][0] = "U6";
		data[1][1] = "P6";
		}
		else if(m.getName().equals("testB")){
		data = new Object [2][3];
		data[0][0] = "U7";
		data[0][1] = "P7";
		data[0][2] = "xyz11@gmail.com";
		
		data[1][0] = "U8";
		data[1][1] = "P8";
		data[1][2] = "xyz11123@gmail.com";	
		}
		return data;
		
	}
	
}
