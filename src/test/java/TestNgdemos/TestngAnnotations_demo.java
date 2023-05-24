package TestNgdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngAnnotations_demo {
	
	WebDriver driver=null;  	//global driver declaration
	  
	   @BeforeSuite
	   public void beforeSuite() 
	   {		   
		 //if we use the excel sheets for storing data.. files are exists or not in the project.		   
	      System.out.println("in beforeSuite");
	      System.setProperty("webdriver.http.factory", "jdk-http-client");
	      System.setProperty("webdriver.chrome.driver",
	    		  "./drivers/chromedriver.exe");	
	      //WebDriverManager.chromedriver().setup();
	   }
		
		  @BeforeTest
		  public void beforeTest() {
		  System.out.println("in beforeTest"); 
		  driver=new ChromeDriver();
		  
		  }		 
	   
	   @BeforeClass//run the method everytime
	   public void beforeClass() {
	      System.out.println("in beforeClass");
	      System.out.println("startup - creating DB connection");	      
	      driver.get("http://www.demo.guru99.com/V4/index.php");
	      driver.manage().window().maximize();
	   }
	   
	   @BeforeMethod
	   public void beforeMethod()
	   {
		   System.out.println("Before Method started....");
	   }
	   
	 
	   //test case 1
	   @Test	   
	   public void loginTestcase() {
		   
		   
		   	System.out.println("in test case 1");
	        WebElement UserID=driver.findElement(By.name("uid"));
	  		UserID.sendKeys("mngr476083");
	  	
	  		WebElement password=driver.findElement(By.name("password"));
	  		password.sendKeys("ypamerU");
	  	
	  		WebElement btnLogin=driver.findElement(By.name("btnLogin"));
	  		btnLogin.click();		
	     
	   }
	   
	   

	   // test case 2
	   @Test
	   public void testCase2() {
	      System.out.println("in test case 2 is under coding........");

	   }


	   @AfterMethod
	   public void afterMethod() {
	      System.out.println("in afterMethod");
	      System.out.println("Logging if the testcase is passed/failed/skipped...code in this section");
	   }	  

	   @AfterClass
	   public void afterClass() {
	      System.out.println("in afterClass");
	      System.out.println("End-up - Closing DB connection");
	   }
	   
	   @AfterTest
	   public void afterTest() {
	      System.out.println("in afterTest");
	      System.out.println("we can close the webdriver here also if requires..");
	   } 
	  

	   @AfterSuite
	   public void afterSuite() {
	      System.out.println("in afterSuite");	      
	      driver.close();
	   }
	

}
