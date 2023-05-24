package inheritanceDemo;

public class Calculation {
	
	static int z=0;
	public static void addition(int x, int y) {
		z = x + y;
		System.out.println("The sum of the given numbers:" + z);
	}

	public static void Subtraction(int x, int y) {
		z = x - y;
		System.out.println("The difference between the given numbers:" + z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addition(10,20);
		Subtraction(30,20);
	}

}
