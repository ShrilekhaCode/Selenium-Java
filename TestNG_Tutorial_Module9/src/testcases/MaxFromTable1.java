package testcases;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxFromTable1 {
    public static void main (String[] args) throws ParseException { 
    	double max = 0, number;
    	
       // double m=0,r=0;
        WebDriver wd; 
        System.setProperty("webdriver.chrome.driver", "C:/Shri/Silenium/Naveen Automation Lab Complete/Download chromedriver/chromedriver.exe");
        wd = new ChromeDriver();
        wd.get("http://money.rediff.com/gainers/bsc/daily/groupa?");
        //No. of Columns
        List <WebElement> col = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
        System.out.println("Total No of columns are : " +col.size());
        //No.of rows
        List <WebElement> rows = wd.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
        System.out.println("Total No of rows are : " + rows.size());
        String columnValue;
        for (int i =1;i<rows.size();i++)
        {    
        	/* Lekha - Option1 - Because of comma in values we use number format,
        	 *  the below will print result of max without comma on console*/
        	
        	 columnValue = wd.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[" + (i+1)+ "]/td[4]")).getText();
       
         	NumberFormat nf = NumberFormat.getInstance();
        	number = nf.parse(columnValue).doubleValue();
        	
        	if(number > max){
            	   max = number;
            	    }
            	}	
          
        /* Lekha - option 2 - if the data on page do not have comma in it like 3,225.00 */
        	/*
        	WebElement columnValue1 = wd.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[" + (i+1)+ "]/td[4]"));
            
        	 if(Double.parseDouble(columnValue1.getText()) > max){
        		   max = Double.parseDouble(columnValue1.getText());
        		    }
        		}
        	 */
        System.out.println("Maximum current price is : "+ max);
        wd.close();
    }
}

