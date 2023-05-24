package StringDemo;

public class StudentDouble_EqualsTest {

		public static void main(String[] args) {
		
			String s1 = "testing awesome";
		      String s2 = "testing awesome";
		      String s3 = new String ("Selenium Test");
		      String s4 = new String ("testing awesomE");
		      System.out.println(s1 == s2);
		      System.out.println(s2 == s3);
		      System.out.println(s1 == s4);

	}
}