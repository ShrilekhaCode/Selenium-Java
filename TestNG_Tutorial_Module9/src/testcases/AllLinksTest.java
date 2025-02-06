package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksTest {			
		
	    public static void main(String[] args) {									
	        String baseUrl = "http://demo.guru99.com/test/newtours/";					
	        System.setProperty("webdriver.chrome.driver","C:/Shri/Silenium/Naveen Automation Lab Complete/Download chromedriver/chromedriver.exe");					
	        WebDriver driver = new ChromeDriver();					
	        		
	        String underConsTitle = "Under Construction: Mercury Tours";					
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);					

			driver.get(baseUrl);		
			
	        List<WebElement> linkElements = driver.findElements(By.tagName("a"));

	        String[] linkTexts = new String[linkElements.size()];							
				int 	i = 0;	
				//String value;
				//String words;
				boolean tik;
				//extract the link texts of each link element		
				for (WebElement e : linkElements) {	
					
				
					tik = e.getText().isEmpty(); //instead of getText()
					if (tik != true){
						//value = e.getText();
						//words = value.trim();
						//linkTexts[i] = words;
						linkTexts[i] =e.getText();
						System.out.println(" next link is  " + linkTexts[i] + " thanks \n");
						i++;
					}
							
				/*	Lekha - For drop down selenium it is not gettin text as it is one empty line as well
				 	and it is drop down list as well as anchor tag
				 	It is still showing empty linktexts
				 */

	        }		

				//test each link		
				for (String t : linkTexts) {							
				//driver.findElement(By.linkText(t)).click();
					driver.findElement(By.partialLinkText(t)).click();   	
				if (driver.getTitle().equals(underConsTitle)) {							
	                System.out.println("\"" + t + "\""								
	                        + " is under construction.");			
	            } else {			
	                System.out.println("\"" + t + "\""								
	                        + " is working.");			
	            }		
				driver.navigate().back();			
	        }		
				driver.quit();			
	    }		
	}


