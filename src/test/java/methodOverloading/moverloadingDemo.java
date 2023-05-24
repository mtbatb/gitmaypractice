package methodOverloading;

public class moverloadingDemo {
	
	
	//instance methods
	public  void methodOne() {
		System.out.println("no-arg method");
	}

	public  void methodOne(int  i)
	{
	System.out.println("int-arg method");	//overloaded methods
	}

	public  void methodOne(double  d) {
		System.out.println("double-arg method");
	}
	public  void methodOne(char  c)
	{
		System.out.println("character method");
	}

	public static void main(String[] args) {
		moverloadingDemo t = new moverloadingDemo();
		t.methodOne();// no-arg method 
		t.methodOne(10);//int-arg method
		t.methodOne(10.5);// double-arg method
		t.methodOne('Y');//char method
	}


}
