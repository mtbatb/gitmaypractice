package abstractvsinterface;

//child class
public class Employee extends Abstract_Test {

	
	
	void VRCInfo() {
		// TODO Auto-generated method stub		
		System.out.println("VrcInfo");		
	}
	

	public static void main(String[] args) {
		//child class
		Employee s = new Employee();
		//Abstract_Test t=new Abstract_Test();
		//Test t=new Test();
		s.printInfo();
		s.changeGear();
		s.VRCInfo();
		s.fun();
	}


	
	void printInfo() {
		// TODO Auto-generated method stub
		String name = "avinash";
		int age = 21;
		float salary = 222.2F;
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);

	}


	

}
