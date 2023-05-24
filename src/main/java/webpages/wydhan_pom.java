package webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class wydhan_pom {
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'JOIN')]")
	public WebElement join_link;

}
