package javaDemos;

public class Student {
	
	String name;
	int rollno;
	
	Student(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student("Yoga",101);
		Student s2=new Student("Anand",102);
		
		System.out.println(s1.name + "  " + s1.rollno);
		
		System.out.println(s2.name + "  " + s2.rollno);
		firstClass.Method1();
		firstClass fc1=new firstClass();
		fc1.Method4();//instance methods/non static methods

	}

}
