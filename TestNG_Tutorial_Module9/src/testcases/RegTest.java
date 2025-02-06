package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegTest {
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void doRegisterTest(){
		String ExpectedTitle = "xxxx";
		String ActualTitle = "yyyy";
		//Assert.assertEquals(ActualTitle, ExpectedTitle);
		//Assert.assertTrue(2>11, "condition if true do not throw error message");
		System.out.println("A");
		Assert.fail("Error message");
		softAssert.assertEquals(ActualTitle, ExpectedTitle);
		softAssert.assertEquals("A", "C");
		System.out.println("B");
		
		softAssert.assertAll();
	}
}
