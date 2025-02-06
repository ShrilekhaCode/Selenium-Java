package example2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerClass1 {
  @Test
  public void Class1_Testcase1() {
	  Assert.assertEquals("Hi", "Hi"); //true
	  
  }
  
  @Test
  public void Class1_Testcase2() {
	  Assert.assertEquals("Hi", "Hello"); // fail
	  
  }
  
}
