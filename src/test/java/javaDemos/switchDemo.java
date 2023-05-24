package javaDemos;

import java.util.ArrayList;

public class switchDemo {

	public static void main(String[] args) {
		//selectBrowser("chrome");
		//sendNumber(10000);
		//String s="";
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list.add("vimal");
		list.add("sonoo");
		list.add("ratan");
		list.add("Suresh123,.049550504*&&%%$^&*FGHJKL");
		list.add("yognand");
		list.add("Bhargav");
		list.add("Jyothi");
		list.add("Radha");
		list.add("rahila");
		// traversing the list of elements using for-each loop
		for (String s : list) { // s map/associate
			System.out.println(s);
		}
		list1.add(20);
		list1.add(30);		
		
		for(int i:list1)//for(int i=1;i<=100;i++)
		{
			System.out.println(i);
		}

	}

	public static void selectBrowser(String name) {

		switch (name) {
		case "chrome":
			System.out.println("chrome browser started......");
			break;

		case "firefox":
			System.out.println("firefox browser started......");
			break;
		case "ie":
			System.out.println("IE browser started......");

			break;
		default:

			System.out.println("Please pass the  valid browser name");
			break;
		}
	}

	public static void sendNumber(int number) {

		System.out.println("input number is :" + number);

		switch (number) {
		case 40:
			System.out.println("Number is 40");
			break;

		case 30:
			System.out.println("Number is 30");
			break;
		case 10:
			System.out.println("Number is 10");
			break;
		default:
			System.out.println("Please pass the valid number");
			break;
		}
	}
}
