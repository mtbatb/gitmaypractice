package TestNgdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class chromeTest {
	
	public WebDriver driver;
	 
	@BeforeTest
	public void beforeTest() {
		 System.setProperty("webdriver.chrome.driver","./driver_folder/chromedriver.exe");
		System.out.println("Initilizing the Google Chrome Driver");
		driver = new ChromeDriver();
	}

     @Test
 	public void ChromeTestMethod()
 	{ 
	  //Initialize the chrome driver
	 System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
	 driver.get("https://www.demo.guru99.com/V4/index.php");
	   driver.manage().window().maximize();
	   
	   //UserId
	   WebElement userID=driver.findElement(By.xpath("//input[@name=\"uid\"]"));
	   userID.sendKeys("mngr453044");
	   
	   //password
	   WebElement userPWD=driver.findElement(By.xpath("//input[@name=\"password\"]"));
	   userPWD.sendKeys("maruqEj");
	   
	   //submit
	   WebElement btnLogin=driver.findElement(By.xpath("//input[@name=\"btnLogin\"]"));
	   btnLogin.click();
       }
 
       @AfterTest
      public void afterTest() {
	 System.out.println("Closing the browser ");
	 driver.close();
       }

}
