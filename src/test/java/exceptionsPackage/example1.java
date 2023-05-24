package exceptionsPackage;

public class example1 {
	
	public static void main(String[] args)
	{
		try 
		{
			//no Runtime error in the code
			System.out.println("try block executed");
		}

		catch (ArithmeticException e) 
		{
			System.out.println("catch block executed");
		}
		finally
		{
			System.out.println("finally block executed");
		}
	}


}
