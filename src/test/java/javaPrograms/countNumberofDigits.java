package javaPrograms;

public class countNumberofDigits {
	
	public static void main(String[] args)
	{
		//Number=145678 --->Number6

		int num=12398456;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}

		System.out.println("Number of Digits:" +count);
	}

}
