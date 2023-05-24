package contructorDemo;

public class StudentInfo {
	
	String name;
	int rollno;
	int age;
	
		StudentInfo(String name,int rollno,int Age)
		{
			this.name=name;
			this.rollno=rollno;
			this.age=Age;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StudentInfo s3=new StudentInfo();
		StudentInfo s1= new StudentInfo("Yoga",101,17);
		StudentInfo s2=new StudentInfo("anand",102,35);
		StudentInfo s3=new StudentInfo("Selenium",109,33);
		System.out.println(s1.name +"  " + s1.rollno +" " +s1.age);
		System.out.println(s2.name + " " + s2.rollno +" " +s2.age);
		System.out.println(s3.name + " " + s3.rollno +" " +s3.age);	

	}

}
