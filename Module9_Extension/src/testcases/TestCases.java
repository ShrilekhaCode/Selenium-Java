package testcases;

import org.testng.annotations.Test;

public class TestCases {

	// multiple Tests - same data - same dataprovider
	//multiple Tests - different data based on calling test method -in same Data Provider
	@Test(priority = 1, dataProviderClass = Data_Provider.class, dataProvider ="samplePRovider")
	public void testA(String u, String p){
		
	}
	
	@Test(priority = 2, dataProviderClass = Data_Provider.class, dataProvider ="samplePRovider")
	public void testB(String u, String p, String q){
		
	}
	
}
