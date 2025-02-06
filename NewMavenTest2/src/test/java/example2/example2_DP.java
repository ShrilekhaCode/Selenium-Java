package example2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class example2_DP {
	@Test (dataProvider = "myData1")
	// we are telling test that dataprovider is myData1
	public void testcase1(String uname, String pwd){
		System.out.println("Testcase1 should run for 4 sets of users");
		System.out.println(uname);
		System.out.println(pwd);
	}
	
	@DataProvider (name = "myData1")
  public Object[][] myDataProvider1() {
		// types of users for which test has to run
		// 4 different type of users and we are passing 
		//two parameters for each users (username and password)
		Object[][] obj = new Object[4][2];
		obj[0][0] =  "user1";
		obj[0][1] = "password1";
		obj[1][0] =  "user2";
		obj[1][1] = "password2";
		obj[2][0] =  "user3";
		obj[2][1] = "password3";
		obj[3][0] =  "user4";
		obj[3][1] = "password4";
		return obj;
  }
}
