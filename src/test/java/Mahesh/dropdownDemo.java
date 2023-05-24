package Mahesh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdownDemo {
	
	@Test
	public void dropdownValues()
	{
		System.setProperty("webdriver.chrome.driver","./driver_folder/chromedriver.exe");
		System.out.println("Initilizing the Google Chrome Driver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/yoganand_bheema/OneDrive/Desktop/testDropdown.html");
		
		Select drpCountry = new Select(driver.findElement(By.name("countries")));
		
		List<WebElement> lstCountries=(List<WebElement>) drpCountry;
		for(WebElement lstCou:lstCountries)
		{
			System.out.println(lstCou);
		}
		
		
		
	}

}
