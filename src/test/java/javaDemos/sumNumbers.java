package javaDemos;

import java.util.Scanner;

public class sumNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y,sum;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		System.out.println("Enter x value");
		
		y=sc.nextInt();
		System.out.println("Enter y value");
		
		sum=sum(x,y);
		
		System.out.println("Sum of two numbers is :"+sum);

	}

	public  static int sum(int x, int y) {
		// TODO Auto-generated method stub
		int sum=x+y;
		return sum;
	}

}
