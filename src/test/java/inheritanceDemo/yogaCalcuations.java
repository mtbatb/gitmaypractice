package inheritanceDemo;

public class yogaCalcuations extends My_Calculation{
	
	public static void division(int x, int y) {
	    int   z = x / y;
	      System.out.println("The division of the given numbers:"+z);
	   }
	
	public static void main(String[] args) {
	
	 int a = 20, b = 10;
	 yogaCalcuations demo = new yogaCalcuations();
     demo.addition(a, b);
     demo.Subtraction(a, b);
     demo.multiplication(a, b);
     demo.division(a,b);
     
	}

}
