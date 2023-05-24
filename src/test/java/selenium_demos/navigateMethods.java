package selenium_demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethods {
	
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","./driver_folder/chromedriver_109.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// Launch Website    
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");     

        //Click on the Link Text using click() command    
        driver.findElement(By.linkText("This is a Link")).click();  

        //Go back to Home Page  
        driver.navigate().back();   

        //Go forward to Registration page  
        driver.navigate().forward();  

        // Go back to Home page  
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");  

        //Refresh browser  
        driver.navigate().refresh();  
    
	}

}
