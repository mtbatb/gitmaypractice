package javaPrograms;

public class Fibonacci_series {

	//0 1 1 2 3  5 8 13 
	//A series of numbers in which each number 
	//(fibonacci number) is the sum of the two
	//preceding numbers.
	public static void main(String[] args)
	{
		// input values 0 1 
		// output : 1 2 3 5 8 13 21 24

		int n1=0, n2=1, sum=0;
		System.out.println(n1+ " " +n2);
		
		for(int i=2;i<10;i++)
		{
			sum=n1+n2; //0+1=1,2
			System.out.println(" " +sum); //1 2
			n1=n2; //n1=1,1
			n2=sum; //n2=1,2
			
			
		}
	}

}
