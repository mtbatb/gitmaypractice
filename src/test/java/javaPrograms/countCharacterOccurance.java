package javaPrograms;

public class countCharacterOccurance {

	public static void main(String[] args) {
		String s = "Selenium";//static 

		int totalcount = s.length();// total len

		int totalcount_afterRmv = s.replace("e", "").length();// total length after remove

		int count = totalcount-totalcount_afterRmv;

		System.out.println("Number occurances of e is :" + count);
	}

}
