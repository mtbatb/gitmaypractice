
public class methoddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method1();
		Method1(100);
		Method1("Selenium");
	}
	
	public static void Method1()
	{
		
		System.out.println("Method1");
	}
	
	public static void Method1(int number)
	{
		
		System.out.println("Method1 "+number);
	}
	
	public static void Method1(String str)
	{
		
		System.out.println("Method1 "+str);
	}

}
