package example;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_Class1_Group {
	//private  WebDriver Driver;
	public static WebDriver Driver;
	
	@BeforeTest
	public void beforeTest() {	
		// Lekha- desired capabilities set for alert unexpected behaviour
		ChromeOptions options = new ChromeOptions();
		options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
		System.setProperty("webdriver.chrome.driver","C:/Shri/Silenium/Naveen Automation Lab Complete/Download chromedriver/chromedriver.exe");					
		Driver = new ChromeDriver(options);
	}	

	String launchPageHeading = "//h2[text()='Guru99 Bank']";
	final String userName_element = "//input[@name='uid']", password_element = "//input[@name='password']",
			signIn_element = "//input[@name='btnLogin']";
	final String userName_value = "mngr28642", password_value = "ydAnate";
	final String managerID = "//td[contains(text(),'Manger Id')]";
	final String newCustomer = "//a[@href='addcustomerpage.php']", fundTransfer = "//a[@href='FundTransInput.php']";

	
	/**
	 * This test case will initialize the webDriver
	 * 
	 */
	@Test (groups = { "bonding", "strong_ties" })
	public void tc01LaunchURL() {
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Driver.get("http://www.demo.guru99.com/V4/");
	}

	/**
	 * Will check the presence of Heading on Login Page
	 */
	@Test (groups = { "bonding" })
	public void tc02VerifyLaunchPage() {
		Assert.assertTrue(Driver.findElement(By.xpath(launchPageHeading)).isDisplayed(),"Home Page heading is not displayed");
		System.out.println("Home Page heading is displayed");
	}

	/**
	 * This test case will enter User name, password and will then click on
	 * signIn button
	 */
	@Test (groups = { "bonding", "strong_ties" })
	public void tc03EnterCredentials() {
		Driver.findElement(By.xpath(userName_element)).sendKeys(userName_value);
		Driver.findElement(By.xpath(password_element)).sendKeys(password_value);
		Driver.findElement(By.xpath(signIn_element)).click();
	}

	/**
	 * This test case will verify manger's ID presence on DashBoard
	 */
	@Test //(groups = { "strong_ties" })
	public void tc04VerifyLoggedInPage() {
		//try {
		Assert.assertTrue(Driver.findElement(By.xpath(managerID)).isDisplayed(),
				"Manager ID label is not displayed");
		
		System.out.println("Manger Id label is displayed");
	
		/**
		 * 
		 * } catch (UnhandledAlertException e) {
		 
		e.printStackTrace();
	    }
	    */
	}

	/**
	 * Lekha- Handling alert in the above and additionally desired capabilities can be set
	 * The solution is to modify the default behaviour of the driver ("IGNORE"), so that it doesn't close the alert:
DesiredCapabilities dc = new DesiredCapabilities();
dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
d = new FirefoxDriver(dc);
	 */
	 
	/**
	 * This test case will check the presence of presence of New customer link
	 * And FundTransfer link in Left pannel
	 */
	@Test (groups = { "bonding" })
	public void tc05VerifyHyperlinks() {
		
		Assert.assertTrue(Driver.findElement(By.xpath(newCustomer)).isEnabled(),
				"New customer hyperlink is not displayed");
		System.out.println("New customer hyperlink is displayed");

		Assert.assertTrue(Driver.findElement(By.xpath(fundTransfer)).isEnabled(),
				"Fund Transfer hyperlink is not displayed");
		System.out.println("Fund Transfer hyperlink is displayed");
		
	}

		
	@AfterTest
	public void afterTest() {
		Driver.quit();			
	}	
}
