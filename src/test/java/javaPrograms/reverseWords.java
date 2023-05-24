package javaPrograms;

public class reverseWords {
	public static void main(String[] args) 
	{

		String str = "Welcome to Java";
		String[] words = str.split("\\s");
		
		// Approach 1 using predefined method
		/*String reverseword = "";
		 * for (String w : words) { StringBuilder sb = new StringBuilder(w);
		 * sb.reverse(); reverseword = reverseword + sb.toString() + " "; }
		 * 
		 * System.out.println(reverseword);
		 */

		// basic approach

		String reverseString = "";

		for (String w : words) {
			String reverseword = "";
			for (int i = w.length() - 1; i >= 0; i--) {
				reverseword = reverseword + w.charAt(i);
			}

			reverseString = reverseString + reverseword + " ";
		}

		System.out.println(reverseString);

	}

}
