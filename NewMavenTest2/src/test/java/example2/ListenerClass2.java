package example2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerClass2 {
  @Test
  public void Class2Testcase1() {
	  Assert.assertEquals("Sun", "moon"); // failed testcase
	  
  }
}
