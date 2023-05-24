package accessModifierTest;

public class childClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Accessing parent class in different class/with in the package level
		accessModiferTest obj=new accessModiferTest();
		obj.Method1();//public 
		obj.Method2();//protected
		//obj.Method3();//private methods....
		obj.Method4();//default
		//obj.Met

	}

}
