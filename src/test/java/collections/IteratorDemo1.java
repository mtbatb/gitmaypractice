package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<=10;i++)
		{
			al.add(i);
		}

		System.out.println(al);

		Iterator<Integer> itr=al.iterator();

		while(itr.hasNext())
		{
			System.out.println(al);
			Integer i=(Integer)itr.next();
			if(i%2==0)
			{
				System.out.println(al);	
			}
			else
			{
				itr.remove();
			}
		}

	}

	

}
