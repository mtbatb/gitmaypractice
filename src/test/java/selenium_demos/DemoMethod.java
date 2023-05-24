package selenium_demos;
 class DemoMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int FourNumTotal=Method1(10,20,30,40);
		System.out.println("Four Arguments"+FourNumTotal);
		int SingleNumber=Method1(10);
		System.out.println("Single Argument"+SingleNumber);
		int ThreeNumTotal=Method1(10,150,60);
		System.out.println("Three Arguments"+ThreeNumTotal);
		int TwoNumTotal=Method1(20,40);
		System.out.println("Two Arguments"+TwoNumTotal);
	}	
	public static int Method1(int number1)
	{
		
		return number1;
	}
	public static int Method1(int number1,int number2)
	{
		
		return number1+number2;
	}
	public static int Method1(int number1,int number2,int number3)
	{
		
		return number1+number2+number3;
	}
	public static int Method1(int number1,int number2,int number3,int number4)
	{
		
		return number1+number2+number3+number4;
	}

}
