package TestNgdemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testclass4 {
	@Test
	public void method1()
	{
		
		System.out.println("Test"+10+15+"yognanad"+20+30);//append
		System.out.println(10+15+"yoga"+20+30);//concant+apoebd
		System.setProperty("webdriver.chrome.driver","./drivers_folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	

}
