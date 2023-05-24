package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class googleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./driver_folder/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
				
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		WebElement search_box=driver.findElement(By.xpath("//input[@name=\"q\"]"));
		search_box.sendKeys("Selenium");
		
		search_box.sendKeys(Keys.ENTER);
		
		WebElement google_wikipedia=driver.findElement(By.xpath("//div[@id=\"search\"]/div/div/div[8]"));
		google_wikipedia.click();
	}

}
