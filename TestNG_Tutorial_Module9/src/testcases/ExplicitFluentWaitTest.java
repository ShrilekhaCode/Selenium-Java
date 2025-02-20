package testcases;

import java.time.Duration;
import java.util.NoSuchElementException;
//import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;


public class ExplicitFluentWaitTest {
		protected WebDriver driver;
		@Test
		public void guru99tutorials() throws InterruptedException 
		{
		System.setProperty ("webdriver.chrome.driver","C:/Shri/Silenium/Naveen Automation Lab Complete/Download chromedriver/chromedriver.exe");
		String eTitle = "Demo Guru99 Page";
		String aTitle = "" ;
		driver = new ChromeDriver();
		// launch Chrome and redirect it to the Base URL
		driver.get("http://demo.guru99.com/selenium/guru99home/" );
		//Maximizes the browser window
		driver.manage().window().maximize() ;
		//get the actual value of the title
		aTitle = driver.getTitle();
		//compare the actual title with the expected title
		if (aTitle.contentEquals(eTitle))
		{
		System.out.println( "Test Passed") ;
		}
		else {
		System.out.println( "Test Failed" );
			}
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(Duration.ofSeconds(30)) 			
				.pollingEvery(Duration.ofMillis(500)) 			
				.ignoring(NoSuchElementException.class);
		
		WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver ) {
				return driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i"));
			}
			} 
		);
		//click on the selenium link
		clickseleniumlink.click();
		//close~ browser
		driver.close() ;
		}
	}


