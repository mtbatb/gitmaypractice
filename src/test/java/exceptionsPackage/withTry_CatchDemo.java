package exceptionsPackage;

public class withTry_CatchDemo {

	public static void main(String[] args) {
		
		
		System.out.println("statement1");

		try 
		{
			System.out.println(10 / 0);
		}

		catch (ArithmeticException e) 
		{
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
		System.out.println("statement3");
		

	}

}
