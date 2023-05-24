package javaPrograms;

import java.util.Scanner;

public class largestof3Numbers {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int a=sc.nextInt();

		System.out.println("Enter Second Number:");
		int b=sc.nextInt();

		System.out.println("Enter Third Number:");
		int c=sc.nextInt();
		//10,20,30
		//Approach 1
		if(a>b && a>c) //10>20 && 10>30 
		{
			System.out.println(a+ "is Largest Number");
		}

		else if(b>a && b>c)//20>10 true && 20>30 false
		{
			System.out.println(b+ "is Largest Number");
		}

		else 
		{
			System.out.println(c+ "is Largest Number");
		}

		
	}

}
