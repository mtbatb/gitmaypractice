package javaPrograms;

public class swappingNumbers {
	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("Before swapping values are.." + a + "  " + b);

		// logic 1 - Third Variable

		int t = a;//assigning a value to the t variable t=10;
			a = b;//assigning b value in the a varialbe a=20;
			b = t;//assigning t value in the b variable b=10;

		System.out.println("After swapping values are " + a + "  " + b);

		// Logic 2 - using + & - with out using third variable
		// a=a+b;  //a=10+20=30 //now a value becomes 30
		// b=a-b;  //b=30-20=10 //now b  value becomes=10
		// a=a-b;  //a=30-10=20 //now a value becomes =20

		
	}

}
