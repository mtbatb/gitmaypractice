package TestNgdemos;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertsDemo {
	
	SoftAssert soft_assert=new SoftAssert();  
	@Test  
	public void Soft_Assert()  
	{  
	 soft_assert.assertTrue(false);  
	 System.out.println("soft assertion");  
	}  
	@Test  
	public void Hard_Assert()  
	{  
	 Assert.assertTrue(false);  
	 System.out.println("hard assertion");  
	}  

}
