package abstractvsinterface;

//parent class
abstract class Abstract_Test {

	//abstract methods	declaration
	  abstract void printInfo();
	 
	 abstract void VRCInfo();
	 
    //non abstract methods
	void changeGear() {
		System.out.println("gear changed");
	}
	
	void changeGear1() {
		System.out.println("gear1 changed");
	}
	
	final void fun()
    {
        System.out.println("Base class final method called");
    }

	
}
