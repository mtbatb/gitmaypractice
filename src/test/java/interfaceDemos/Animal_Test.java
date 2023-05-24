package interfaceDemos;

public class Animal_Test implements AnimalEat, Travel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal_Test a = new Animal_Test();
		a.eat();
		a.travel();

	}

	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("Animal is Traveling");
	}

	@Override
	public void demo1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void demo() {
		// TODO Auto-generated method stub

	}

	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Animal is eating");
	}

}
