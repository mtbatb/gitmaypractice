package abstractvsinterface;

public class programmingLanguage implements Language {

	//implementation of abstract method
	public void getName(String name) {
		System.out.println("Programming Language: " + name);
	}

	public static void main(String[] args) {
		programmingLanguage language = new programmingLanguage();
		language.getName("Java");
	}

}
