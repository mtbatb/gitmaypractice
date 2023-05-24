package methodOverloading;

public class moverloadingDemo1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method1(10);
		Method1();
		Method1(10,20);
		Method1("Testing");
	}
	
	//static methods
	public static void Method1(int number)
	{
		System.out.println("Method1...");
	}
	
	public static void Method1()
	{
		System.out.println("Method1...");
	}
	
	public static void Method1(int num,int number2)
	{
		System.out.println("Method1...");
	}
	public static void Method1(String name)
	{
		System.out.println(name);
	}


}
