package polymorpishm;

public class testMyPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//parent class lo create chesina Oka method -->Reuse child class using Extends keyword..
		//we need child class interest 
		
		RBIBank b;//Declaration variable for parent class
		b=new SBI();//initilization child class
		System.out.println("Sbi Interest Rate "+b.getRateOfInterest());
		b=new ICICI();
		System.out.println("ICICI Interest Rate "+b.getRateOfInterest());
		
		
	}

}
