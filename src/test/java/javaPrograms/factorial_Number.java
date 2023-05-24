package javaPrograms;

public class factorial_Number {

	public static void main(String[] args) {
		// A factorial is a function/method
		// that multiplies a number by every number
		// Ex: 5!=5*4*3*2*1=120

		int num = 4;

		long factorial = 1;

		for (int i = 1; i <= num; i++) 
		{
			factorial = factorial * i;//1*1=1,2*1=2,3*2=6,6*4=24,24*5=120,120*6=720
		}

		System.out.println("Factorial Number is :" + factorial);
	}

}
