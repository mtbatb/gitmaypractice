package accessModifierTest;

public class childProt extends Demo {
	public static void main(String args[]) {
		Demo a = new Demo();
		a.methodOne();
		childProt b = new childProt();
		b.methodOne();
		Demo a1 = new childProt();
		a1.methodOne();
	}
}



