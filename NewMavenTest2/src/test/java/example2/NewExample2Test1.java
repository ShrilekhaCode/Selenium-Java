package example2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewExample2Test1 {
  @Test (groups = {"Regression"})
  public void GroupTestCaseMethod1() {
	  System.out.println("This testcase is for regression testcase");
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
