package TestNgdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvderDemo {	
		
		WebDriver driver;
	  	@DataProvider(name = "test-data")
	  	public Object[][] dataProvFunc(){
	        	return new Object[][]{
	              	{"mngr453044","maruqEj"},{"mngr451543","vAgYjEd"},
	              	{"mngr451543","yoganand"}
	        	};
	  	}
	  	@BeforeMethod
	  	  public void setUp() {
	         	  System.out.println("Start test");
	         	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     		 driver=new ChromeDriver();		
	     		driver.get("https://www.demo.guru99.com/v4");
	        	  
	        	  driver.manage().window().maximize();
	        	 
	  	  }
	  	@Test(dataProvider ="test-data")
	  	public void search(String keyWord1, String keyWord2){
	  		
	  		
	  		WebElement username=driver.findElement(By.xpath("//input[@name='uid']"));
			username.sendKeys(keyWord1);
			
			WebElement pasword=driver.findElement(By.xpath("//input[@name='password']"));
			pasword.sendKeys(keyWord2);
			
			WebElement btnLogin=driver.findElement(By.xpath("//input[@name='btnLogin']"));
			btnLogin.click();
	        	  
	  	}
	  

}
