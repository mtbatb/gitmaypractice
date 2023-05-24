package accessModifierTest;

public class accessModiferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//with in the method accessing:
		Method1();
		Method2();
		Method3();
		Method4();
		
		accessModiferTest obj=new accessModiferTest();
		obj.Method5();
		
	}
	
	//instance Method
	public void Method5()
	{
		System.out.println("Method5");
	}
	//static method
	public static void Method1()
	{
		System.out.println("Method1");
	}
	
	protected static void Method2()
	{
		System.out.println("Method2");
	}
	
	private static void Method3()
	{
		System.out.println("Method3");
	}
	//default modifier taken if you don't specify any access modifer
	static void Method4()
	{
		System.out.println("Method4");
	}

}
