package javaPrograms;

import java.util.Arrays;

public class CheckArraysREqual {

	public static void main(String[] args)
	{
		int a1[]={1,2,4,5};
		int a2[]={1,2,5,4};
		int size_array=a1.length;
		int size_array_2=a2.length;
		
		System.out.println(size_array);
		System.out.println(size_array_2);
		
		if(size_array!=size_array_2)
		{
			
		}
		else
		{
			
		}
		//int size_Status=Arrays.equals(size_array);
		
		boolean status=Arrays.equals(a1,a2);
		
		if(status==true)
		{
			System.out.println("Arrays are equal");
		}

		else
		{
			System.out.println("Arrays are Not equal");
		}
	}
}
