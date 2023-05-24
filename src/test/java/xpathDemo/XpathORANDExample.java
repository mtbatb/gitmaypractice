package xpathDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathORANDExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers_Folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=Gl"
				+ "ifWebSignIn&flowEntry=SignUp");
		
		//below are the different types of Xpath
		
		//Finding the organization field via xpath using OR
		WebElement First_Name=driver.findElement
				(By.xpath("//input[@name=\"firstName\" and @id='firstName']"));
		First_Name.sendKeys("Test");
        
                //Finding the full name field via xpath using AND
		WebElement last_name=driver.findElement(By.xpath("//input[@name=\"firstName\" or @id='firstName']"));
		last_name.sendKeys("fullName_Test_Lambdatest");
              

	}

}
