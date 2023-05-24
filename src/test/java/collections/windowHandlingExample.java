package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driversfolder/chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");	
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
            //single window id
		String parent_Window =driver.getWindowHandle();
                System.out.println(parent_Window);
		
                //Multiple window id's 
		Set<String> set =driver.getWindowHandles();
		 // Using Iterator to iterate with in windows replicate of for loop  
		 Iterator<String> itr= set.iterator();//1,2 id's--abc,xyz
		 //1,2,3,4
		 while(itr.hasNext())//conditional check+loop either yes/no
		 {
			 String ChildWindow=itr.next();//next index number id get
                         System.out.println(ChildWindow);		
     		
	            if(!parent_Window.equalsIgnoreCase(ChildWindow))			
	            {    	
	                 
	                    // Switching to Child window
                          //driver.switchTo().alert()
	                    driver.switchTo().window(ChildWindow);
	
	                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	                    driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");                			
	                    
	                    driver.findElement(By.name("btnLogin")).click();	
	                    
			                            

	                    // Closing the Child Window.
	                        //driver.close();	
	            }
	            
		 }
		 
		// This is  switch back to the main window/parent window
		driver.switchTo().window(parent_Window);
		 
	}
	}


