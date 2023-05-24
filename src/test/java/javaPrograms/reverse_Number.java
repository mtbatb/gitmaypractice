package javaPrograms;

import java.util.Scanner;

public class reverse_Number {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println("user entered number :"+num);
		
		//1/using algorithm
		
		/*
		 * int rev=0; //storing the reverse number while(num!=0) { rev=rev*10+num%10;
		 * //0+1234%10=4 , 40+3=43 430+2=432 4320+1=4321 num=num/10;//1234/10=123
		 * 123/10=12 12/10=1 1/10=0 }
		 * 
		 * System.out.println("Reverse Number is :"+rev);
		 */
		 
		 	
		

		//Using StringBuffer class
			
		
		/*
		 * StringBuffer sb=new StringBuffer(String.valueOf(num)); StringBuffer
		 * rev1=sb.reverse(); System.out.println("Reverse number is :"+rev1);
		 */
		 
		  
		  //Using StringBuilder class and using predefined reverse method 
			
			
			
			  StringBuilder sb1=new StringBuilder();  
			  sb1.append(num);//store
			  StringBuilder rev2=sb1.reverse();
			  System.out.println("Reverse number is :"+rev2);
	 
}
	 
		 
}