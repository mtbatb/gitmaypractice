package javaPrograms;

import java.util.Scanner;

public class CountsumOfDigits {
	
	public static void main(String[] args)
	{
		//STATIC /Contact 
		Scanner sc=new Scanner(System.in);
		System.out.println("Please provide any 4 or 5 digit number");
		
		int num=sc.nextInt();
		System.out.println("Give number"+num);

		int sum=0;  //storing the sum of that particular number

		while(num>0)  //1234 
		{
			sum=sum+num%10;  //4+3+2+1--remainder//rev=rev + num%10;
			num=num/10; //quotient 123 12 1 0	
		}

		System.out.println("Sum of digits in a number"+sum);
	}


}
