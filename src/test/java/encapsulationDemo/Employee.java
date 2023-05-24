package encapsulationDemo;

public class Employee {

	private String name;
	private String idNum;
	private int age;
	private float heigth;

	

	public float getHeigth() {
		return heigth;
	}

	public void setHeigth(float heigth) {
		this.heigth = heigth;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public void setName(String newName) {
		name = newName;
	}
	
	public void setIdNum(String newidNum) {
		idNum = newidNum;
	}

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setAge(30);
		e.setName("Test");
		e.setIdNum("101");
		e.setHeigth(5.6f);
		System.out.println("Age is : "+e.getAge());
		System.out.println("Name is : "+e.getName());
		System.out.println("IdNum is : "+e.getIdNum());
		System.out.println("Heigth is : "+e.getHeigth());
		
		
	}

}
