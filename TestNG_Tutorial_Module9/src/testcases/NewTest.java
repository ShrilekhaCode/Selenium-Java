package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	

	 public String baseUrl = "http://demo.guru99.com/selenium/newtours/";
	 //  String driverPath = "C:\\Shri\\Silenium\\Naveen Automation Lab Complete\\Download chromedriver\\chromedriver.exe";
	    String driverPath = "C:/Shri/Silenium/Naveen Automation Lab Complete/Download chromedriver/chromedriver.exe";
	    public WebDriver driver; 
	    public String expected = null;
	    public String actual = null;
	    @BeforeTest
	      public void launchBrowser() throws Exception{
			System.setProperty("webdriver.chrome.driver","C:\\Shri\\Silenium\\Naveen Automation Lab Complete\\Download chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://reg.ebay.in/reg/PartialReg");
			
	    }
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
