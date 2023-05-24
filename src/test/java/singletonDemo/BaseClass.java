package singletonDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {	
	
	   public static WebDriver driver=null;
	   public static void main(String[] args)
	   {
		   initilize();
		   openurl(ConstantVariable.URl);
		   close();
		   
	   }
	   
	   public static void initilize()
	   {
	      //Use Of Singleton Concept and Initilize webDriver
	      if(driver == null)
	      {
	         if(ConstantVariable.browserName.equalsIgnoreCase("Chrome"))
	         {
	            System.setProperty("webdriver.chrome.driver", "./driver_folder/chromedriver_109.exe");
	            driver=new ChromeDriver();
	         }
	         else if(ConstantVariable.browserName.equalsIgnoreCase("Firefox"))
	         {
	            System.setProperty("webdriver.gecko.driver", "./driversfolder/geckodriver.exe");
	            driver=new FirefoxDriver();
	         }
	         
	      }
	      
	      //Perform Basic Operations
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
	   }
	   
	   public  static void openurl(String URL)
	   {
	      driver.get(URL);
	   }
	   public static void close()
	   {
	      driver.close();
	      driver=null;  // we destroy the driver object after quit operation
	   }   
	   

}
