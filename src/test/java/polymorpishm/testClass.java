package polymorpishm;

public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RBIBank b;//parent class variable created
		
		b=new SBI();//created variable assing to SBI Class
		System.out.println(b.getRateOfInterest());
		
		b=new ICICI();
		System.out.println(b.getRateOfInterest());

	}

}
