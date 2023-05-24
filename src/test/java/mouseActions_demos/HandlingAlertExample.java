package mouseActions_demos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./Drivers_Folder/chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
       
        WebElement custId=driver.findElement(By.xpath("//input[@name='cusid']"));
        custId.sendKeys("0012145");
        
        WebElement Submitbtn=driver.findElement(By.xpath("//input[@name='submit']"));
        Submitbtn.click();
        
        // Switching to Alert 
        //Actions actions=new Actions(driver);mosuse houver actions"double clikc,right click,       
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert (Yes/Ok)		
        alert.accept();	
       
        //Rejecting alert (No/Cancel)
        alert.dismiss();	
        
        //sometimes we need to enter the text in the alert
        //driver.switchTo().alert().sendKeys("Selenium");

	}

}
