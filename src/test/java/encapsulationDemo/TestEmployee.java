package encapsulationDemo;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e=new Employee();
		e.setAge(20);
		e.setName("yoganand");
		e.setIdNum("102");
		System.out.println("Age is : "+e.getAge());
		System.out.println("Name is : "+e.getName());
		System.out.println("IdNum is : "+e.getIdNum());
	}

}
