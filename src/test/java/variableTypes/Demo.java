package variableTypes;

public class Demo {
	
	int j=20;//non static variable
	public void instancemethod()
	{
		System.out.println("Instance Method");
	}	
	static String student="test";
	
	public static void Method2()
	{
		System.out.println("Method2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo prema_latha=new Demo();
		System.out.println(prema_latha.j);
		
		prema_latha.instancemethod();		
		//prefered way using classname 
		System.out.println(Demo.student);
		Demo.Method2();
		
		
	}

}
