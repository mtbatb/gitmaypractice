package selenium_demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class facebookCreatepage {	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();			
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.DAYS);
		 WebElement createAccount=driver.findElement
				 (By.xpath("//form[@data-testid=\"royal_login_form\"]/div[5]/a"));
		 createAccount.click();
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 		 WebElement firstName=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
				 //firstName.sendKeys("Selenium");
		 		 input(firstName,"Selenium","firstName");
				 
				 WebElement dayslist=driver.findElement(By.xpath("//select[@id=\"day\"]"));
				 selectVisibleText(dayslist, "15","days");
				 //parameter/arguments
				 
				 //WebElement username =driver.findElement(By.xpath("fjdakfdjaskslf"));
				 //sendKeys(username,"Admin");
				 //username.sendKeys("Admin");
					/*
					 * public static void sendKeys(WebElement ele,String data) {
					 * 
					 * }
					 */
				 //username,"Admin","Username"
				 WebElement monthsList=driver.findElement(By.xpath("//select[@id='month']"));
				 selectByIndex(monthsList, 8, "month");
				 
				 WebElement yearsList=driver.findElement(By.xpath("//select[@id='year']"));
				 selectByValue(yearsList, "2024", "year");				 
				 
				 WebElement genderMale=driver.findElement(By.xpath("//div[@class=\"mtm _5wa2 _5dbb\"]/span/span[2]/input"));
				 click(genderMale,"Male"); 
				//Select sel=new Selct(ele);
				 //sel.selectByIndex(10);
			}

	
	//selectVisibleText(dayslist, "11", "days");
	public static void selectVisibleText(WebElement ele, String data,String fieldName) {
		try {
			if (ele.isDisplayed()) {
				new Select(ele).selectByVisibleText(data);
				
			}

		} catch (Exception e) {
			// logger.log(Status.FAIL, "Unable to Select Value at this point of time");
			Assert.fail("Unable to Select Value at this point of time " + e.getMessage());
		}    
	}
    // selectByValue(yearsList, "1995", "year");
	public static void selectByIndex(WebElement ele, int data, String fieldName) {
		try {
			if (ele.isDisplayed()) {
				new Select(ele).selectByIndex(data);
				
			}

		} catch (Exception e) {
			// logger.log(Status.FAIL, "Unable to Select Value at this point of time");
			Assert.fail("Unable to Select Value at this point of time " + e.getMessage());
		}
	}
	
	public static void selectByValue(WebElement ele, String data, String fieldName) {
		try {
			if (ele.isDisplayed()) {
				new Select(ele).selectByValue(data);				
			}

		} catch (Exception e) {
			// logger.log(Status.FAIL, "Unable to Select Value at this point of time");
			Assert.fail("Unable to Select Value at this point of time " + e.getMessage());
		}
			
	}
	
	public static void click(WebElement ele, String fieldname) {

		try {
			if (ele.isDisplayed() || ele.isEnabled()) {

				ele.click();
			
			}
		} catch (Exception e) {
			// logger.log(Status.FAIL, "Element is Not Displaye at this point of time");
			Assert.fail("Element is Not Displaye at this point of time " + e.getMessage());
		}
	}
	//WebElement firstName=driver.findElement(By.xpath(""));
	//input(firstName,"Yoganand","firstName");
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
}
