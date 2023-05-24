package TestingMethods;

public class testMethodOverload {
    //Entry point 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testMethodOverload obj=new testMethodOverload();
		//Surname(Boy)//static 
		 Method1();
		 
		//instance method 
		obj.Method2();
		obj.Method3();
		
	}
	//access           Methodname
	public static void Method1()
	{
		
		System.out.println("Methodone-1");
	}
	
	public static void Method1(int number,String name)
	{
		
		System.out.println("Method-1-2"+name);
	}
	public static void Method1(int number1,int number2)
	{
		
		System.out.println("Method-1-3"+number1+number2);
	}
	public static void Method1(int number1,int number2,int number3)
	{
		
		System.out.println("Method-1-4"+number1+number2+number3);
	}
	public static void Method1(int num1,int num2,int numb3,int num4)
	{
		
		System.out.println("Method-1-5"+num1+num2+numb3+num4);
	}
	
	//instance /non static 
	public void Method2()
	{
		System.out.println("Method2...");
	}
	
	public void Method3()
	{
		System.out.println("Method3...");
	}
	
	
	//How to call a static method from your main method?//Mounika/Mallika
	//How to call a Non Static method from your main method?//Mallika

}
