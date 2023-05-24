package variableTypes;
public class testVariables {
	
	static int i=20;//static + data type+ variable name =value==>>static variable
	       int j=30;//may be instance// local
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int i=100;
		System.out.println("Main Method Value"+i);
		Method1();
		Method2();
		Method3();
		Method4();
	}
	
	public static void Method1()
	{
		int i=200;
		System.out.println("Method1 Value"+i);
	}
	public static void Method2()
	{
		int i=300;
		System.out.println("Method2 Value"+i);
	}
	public static void Method3()
	{
		int i=400;
		System.out.println("Method3 Value"+i);
	}
	public static void Method4()
	{
		int i=500;
		System.out.println("Method4 Value"+i);
	}
	
	

}

