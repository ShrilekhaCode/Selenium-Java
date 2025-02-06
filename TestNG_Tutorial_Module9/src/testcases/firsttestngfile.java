package testcases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

//@Test                             // (Lekha-Do we eed this @Test here?)
public class firsttestngfile {
    public String baseUrl = "http://demo.guru99.com/selenium/newtours/";
   // String driverPath = "C:\\Shri\\Silenium\\Naveen Automation Lab Complete\\Download chromedriver\\chromedriver.exe";
    String driverPath = "C:/Shri/Silenium/Naveen Automation Lab Complete/Download chromedriver/chromedriver.exe";
    public WebDriver driver; 
    public String expected = null;
    public String actual = null;
    
        @BeforeTest
      public void launchBrowser() throws Exception{
          System.out.println("launching chrome browser"); 
          System.setProperty("webdriver.chrome.driver", driverPath);
          driver= new ChromeDriver();
          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // Lekha
          driver.get(baseUrl);
      }
      
      @BeforeMethod
      public void verifyHomepageTitle() {
          String expectedTitle = "Welcome: Mercury Tours";
          String actualTitle = driver.getTitle();
          Assert.assertEquals(actualTitle, expectedTitle);
      }
          @Test(priority = 0)
          public void register(){
          driver.findElement(By.linkText("REGISTER")).click() ;
          expected = "Register: Mercury Tours";
          actual = driver.getTitle();
          Assert.assertEquals(actual, expected);
      }
          @Test(priority = 1)
          	public void support() {
            driver.findElement(By.linkText("SUPPORT")).click() ;
            expected = "Under Construction: Mercury Tours";
            actual = driver.getTitle();
            Assert.assertEquals(actual, expected);
      }
      @AfterMethod
      public void goBackToHomepage ( ) {
            driver.findElement(By.linkText("Home")).click() ;
      }
       
      @AfterTest
      public void terminateBrowser(){
          driver.close();
      }
}
