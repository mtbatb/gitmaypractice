package javaPrograms;

public class countEvenorOddDigits {
	public static void main(String[] args) {
		// Number=1456897
		// Even Digits=3 Odd Digits=4
		int num = 12348;
		int even_count = 0;
		int odd_count = 0;
		while (num > 0) // 1234 123 12 1
		{
			int rem = num % 10; // 4 3 2
			if (rem % 2 == 0) {
				even_count++; // 1 2
			} else {
				odd_count++;
			}

			num = num / 10; // 123 12 1
		}
		System.out.println("Even count is :"+even_count);
		System.out.println("Odd count is :"+odd_count);
	}

}
