package testcases;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegTest {
	/* No. of input parameter in the below testcase method, is same as the
	  number of columns of the 2-D Object's returned from DataProvider method */
	/* The parameterized testcase will execute row number times with the 
	  	DataProvider returned 2-D Objects */
	@Test(dataProviderClass=Data_Provider.class, dataProvider="regtestDataPRovider")
	public void doRegister(String username, String password, String email){
		// code for registering on website
	}
	// parameterizing testcases, we provide DataProvider
	@DataProvider
	public Object[][] getData(){
		Object data[][] = new Object[2][3];// rows 2, and columns 3
		data[0][0] = "U1";
		data[0][1] = "P1";
		data[0][2] = "xyz@gmail.com";
		data[1][0] = "U2";
		data[1][1] = "P2";
		data[1][2] = "xyz1@gmail.com";
		return data;	
	}
}
