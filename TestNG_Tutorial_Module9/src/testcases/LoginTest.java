package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {

	// DataPovider tutorial
	@AfterMethod
	public void afterMethod(){
		System.out.println("--------After Method --------");
		System.out.println();
		System.out.println();
		}
	
	@Test(dataProvider = "getData")
	public void doLoginTest(String Username,
			String Password,
			String expRes, 
			String Browser,
			int phonenumber){
		System.out.println(" User name " + Username + " Password " + Password);
		
	}
	
	@DataProvider(parallel = true)
	// 2D Object Array
	public Object[][] getData(){
		Object[][] data = new Object[3][5]; // 3 rows (index 0,1,2), and 4 columns(index 0,1,2,3)
		//1st row
		data[0][0] = "U1";
		data[0][1] = "P1";
		data[0][2] = "Pass";
		data[0][3] = "Mozilla";
		data[0][4] = 12345; // phone
		//2nd row
		data[1][0] = "U2";
		data[1][1] = "P2";
		data[1][2] = "Pass";
		data[1][3] = "Chrome";
		data[1][4] = 12345;
		//3rd row
		data[2][0] = "U3";
		data[2][1] = "P3";
		data[2][2] = "Fail";
		data[2][3] = "IE";
		data[2][4] = 12345;
		return data;
		
	}
}
