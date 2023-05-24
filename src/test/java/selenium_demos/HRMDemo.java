package selenium_demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HRMDemo {
	
	public static WebDriver driver=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        commonCode();
        
		//https://www.amazon.in/
		//4.provide username in the textbox username
		WebElement username=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		username.sendKeys("Admin");
		//5.provide password in the textbox username
		WebElement password=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		//password.sendKeys("admin123");
		input(password,"admin123","password");
		//6.click on login button
		WebElement btnLogin=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		//btnLogin.click();
		click(btnLogin,"Login");
		//Registration 50 controls like textbox,buttons,
		//one control -->xpath + action =50 *2=100
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions actions=new Actions(driver);
		WebElement dashboard_page=driver.findElement(By.xpath("//div[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[7]/a/span"));
		actions.moveToElement(dashboard_page).build().perform();
		dashboard_page.click();
	}
	
	public static void commonCode()
	{
		//1.open browser chrome
				System.setProperty("webdriver.chrome.driver","./driver_folder/chromedriver.exe");
				 driver=new ChromeDriver();
				//2.provide application url
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				//3.maximize window
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	
	public static void input(WebElement ele, String data, String fieldName) {
		try {
			//System.out.print("1");
			if (ele.isDisplayed()) {
				ele.clear();
				ele.sendKeys(data);
				
			}
		} catch (Exception e) {
			
			Assert.fail("Element is Not Displayed at this point of time " + e.getMessage()+fieldName);
		}
	}
	
	public static void click(WebElement ele, String fieldname) {

		try {
			if (ele.isDisplayed() || ele.isEnabled()) {

				ele.click();
			
			}
		} catch (Exception e) {
			// logger.log(Status.FAIL, "Element is Not Displaye at this point of time");
			Assert.fail("Element is Not Displayed at this point of time " + e.getMessage());
		}
	}
}
