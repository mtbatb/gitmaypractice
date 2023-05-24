package variableTypes;

public class DemoVariable {
	
	//local /instance variable
	int i=100;//primitive
	String s="seleniumBatch";//non primitive 
		
	//static variable 
	static int k=500;
	static String str="myDemo";
	public static void main(String[] args)
	{	
		//creation of object
		DemoVariable demo=new DemoVariable();		
		demo.InstanceMethod();
		System.out.println("Instance integer variable"+demo.i);
		System.out.println("Instance string variable"+demo.s);
		
		
		StaticMethod();
		System.out.println("Static integer variable"+k);
		System.out.println("Static string variable"+str);		
		
	}
	
	public void InstanceMethod()
	{
		
		System.out.println("Instance Method calling...");
	}
	
	
	public static void StaticMethod()
	{
		
		System.out.println("Static Method calling...");
	}

}
