package selenium_demos;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class screenshotDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//System.setProperty("webdriver.chrome.driver","./driver_folder/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);			
		//input[@name="uid"]
		WebElement UserID=driver.findElement(By.name("uid"));
		UserID.sendKeys("mngr476083");
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("ypamerU");
		
		
		WebElement btnLogin=driver.findElement(By.xpath("//input[@name=\"btnLogin\"]"));
		btnLogin.click();

            
		try {
			try {
		
			//format setting the filename Sat_Apr_18_16-50-21_IST_2020
			String fileName = (new Date()).toString().replace(" ", "_").replace(":", "-").trim()+".png";//
					   //new Date() -->Tue Mar 08 10:16:06 IST 2022.png                                                      
					   //              Tue_Mar_08_10-16-06_IST_2022.png  
	
			
			String destinationFilePath = System.getProperty("user.dir")
					+File.separator+"yoganand/"+fileName;
			
			System.out.println(destinationFilePath);
			try 
			{
			    //javaScriptExecutor jse=(javaScriptExecutor)driver;
				TakesScreenshot ts = (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE); //dynamic screenshots //WIndows+Shift+S
				File destination=new File(destinationFilePath);
				FileUtils.copyFile(source, destination);
			} 
			catch (Exception e) {
				
				System.out.println("Exception while taking screenshot " + e.getMessage());
			}			
			

		} 
			catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.close();
	
}
		finally {
			
		}
		}

	}


