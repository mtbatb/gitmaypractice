package TestNgdemos;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ignore_TestDemo {
	
	String message = "Manisha"; 
	
	@Test
   public void testDrintMessage() {
      System.out.println("Inside testPrintMessage()");
      message = "Managerhomepage";
      Assert.assertEquals(message, "Managerhomepage");
   }

   @Test(enabled = false)
   public void testNalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Manisha";
      Assert.assertEquals(message, "Hi!Manisha");
   }
   @Test
   public void testDLMessage() {
      System.out.println("testMessage with out using Enable=true anotation");
      message = "Hi!" + "Bharathi";
      Assert.assertEquals(message, "Hi!Bharathi");
   }
   
   @Test
   public void TestMethod()
   {
	   System.out.println("Yoganand");
   }
   

}
