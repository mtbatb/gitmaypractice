package exceptionsPackage;

public class example2 {
	
	public static void main(String[] args)
	{
	try
	{
	System.out.println("try block executed");
	System.out.println(10/0);
	}
	catch(ArithmeticException e)
	{
	System.out.println("catch block executed");
	}
	finally
	{
	System.out.println("finally block executed");
	}}


}
