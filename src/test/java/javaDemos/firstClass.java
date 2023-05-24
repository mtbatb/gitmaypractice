package javaDemos;

public class firstClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=100;
		int i=20;
		System.out.println(i);
		Method1();
		Method2();
		Method3();
		firstClass fc=new firstClass();
		fc.Method4();
		//j;
		System.out.println("instance variable is :"+fc.j);
	}
	//20,200,300,400//chandana
	//20,20,20//sneha,akram
	//200,300,400--arun
	//Nothing--yoganand
	//salary-55000
	//petrol-instance/stock market
	
	static int k=30;//static variable
	public static void Method1()
	{
		int i=200;
		System.out.println("Method1 value is "+i);
	}
	 int j=30;//instance variable
	public   void Method4()//instance method
	{
		int i=200;
		System.out.println("Method4 value is "+i);
	}
	public static void Method2()
	{
		int i=300;
		System.out.println("Method2 value is "+i);
	}
	public static void Method3()
	{
		int i=400;
		System.out.println("Method3 value is "+i);
	}

}
