package contructorDemo;

class Student4{  
    int id;  
    String name;  
    Student4()
    {
    	System.out.println("default constructor");
    }
    //creating a parameterized constructor  
    Student4(int i,String n){  
    this.id = i;  
    this.name =n;  
    }  
    //method to display the values  
    void display()
    {
    	System.out.println(id+" "+name);
    }  
   
    public static void main(String args[]){  
    //creating objects and passing values  
    Student4 s1 = new Student4(111,"Karan"); 
    Student4 s2 = new Student4(222,"Aryan");  
    //calling method to display the values of object  
    //System.out.println(s1.name +"  " + s1.rollno);
	//System.out.println(s2.name + " " + s2.rollno);
    s1.display();  
    s2.display();
    //s10.display();
   }  
}  