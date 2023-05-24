package staticinstanceflow;

public class instanceFlow {
	
	int i=10;
	{
		methodOne();
		System.out.println("first instatnce block");
	}

	instanceFlow()
	{
		System.out.println("parenct class contructor");

	}

	public static void main(String[] args)
	{
		instanceFlow p=new instanceFlow();
		System.out.println("main Method");
	}

	public void methodOne()
	{
		System.out.println(j);
	}

	{
		System.out.println("second instance block");
	}

	int j=20;
	}


