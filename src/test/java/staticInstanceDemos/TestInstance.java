package staticInstanceDemos;

public class TestInstance {
	int i = 10;

		public static void main(String[] args)
		{
		//System.out.println(i);//C.E:non-static variable i cannot be referenced from a static context(invalid)
		TestInstance t=new TestInstance();
		System.out.println(t.i);//10(valid)
		t.methodOne();
		t.methodTwo();
		}

	public void methodOne() {
		System.out.println(i);// 10(valid)
	}
	
	public void methodTwo() {
		int j=20;
		
		System.out.println("methodTwo instance variable:"+j);
	}
}
