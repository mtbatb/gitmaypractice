package javaPrograms;

public class MaxMinValueInArray {

	public static void main(String[] args) {
		int a[] = { 100,120,50, 40, 30, 60, 20, 10 ,0};

		int max = a[0];
		int min = a[0];

		for (int i = 1; i < a.length; i++) 
		{
			if (a[i] > max) 
			{
				max = a[i];
			}

			else if (a[i] < min) {
				min = a[i];
			}
		}

		System.out.println("Max element in array is :" + max);

		System.out.println("Min element in array is :" + min);
	}

}
