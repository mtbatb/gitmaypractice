package javaDemos;

public class methodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method1(10);
		Method1();
		Method1(10,20);
		Method1("Testing");
		sumNumber(10,20);
	}
	public static int sumNumber(int number,int number2) {
		
		int sum=number+number2;
		return sum;
	}
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
