package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class guruLoginpage {
	//page object model
	
	@FindBy(how=How.XPATH,using="//input[@name='uid']")
	public WebElement username;	
		
	//WebElement username1=driver.findElement(By.xpath(""));
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	public WebElement userpwd;	
	
	@FindBy(how=How.XPATH,using="//input[@name='btnLogin']")
	public WebElement loginBtn;
	
	@FindBy(how=How.XPATH,using="")
	public WebElement userId;
	
		
	@FindBy(how=How.XPATH,using="")	
	public WebElement HelpLink;
	
	@FindBy(how=How.XPATH,using="")
	public WebElement userPath;
	
	
	
	
	
	
	
	
	
	

}
