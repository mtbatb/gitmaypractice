package polymorpishm;

public class TestPolymorphism {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int i;//variable Declaration
		RBIBank b;  //class Bank only declaration//parent class /Global class variable
		b=new SBI();

		System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
		  
		b=new ICICI();  
		System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());
		  
		b=new AXIS();  
		System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());  
		
		//TestPolymorphism obj=new TestPolymorphism();
		//System.out.println(TestPolymorphism.getInterest());
		//System.out.println(TestPolymorphism.Rate());
		//Method1();
	}	
	public static void Method1()
	{
		System.out.println("Method1...");
	}
	
	public static float getInterest()
	{
	return 10.3f;
	} 
	
	public static float Rate()
	{
		return 18.90f;
	}

}
