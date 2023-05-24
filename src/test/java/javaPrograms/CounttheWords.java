package javaPrograms;

import java.util.Scanner;

public class CounttheWords {

	public static void main(String[] args) 
	{
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();// Welcome to Java

		int count = 1;

		for (int i = 0; i < s.length() - 1; i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				System.out.println("selenium");
				count++;
			}
		}
		
		System.out.println("Count the words:"+count);

	}

}
