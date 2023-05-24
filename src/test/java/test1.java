
public class test1 {
	public static void main(String[] args) {	
			
		selectBrowser("ie",10);

	}
	public static void  selectBrowser(String name,int number) {
		
		switch(name) {
				case "chrome":			
					System.out.println("chrome browser started......"+number);
					break;
		
				case "firefox":
				System.out.println("firefox browser started......"+number);
					break;
				case "ie":
						System.out.println("IE browser started......"+number);
						
					     break;
				default:					
					System.out.println("Please pass the  valid browser name");
					break;
				}
		}


	
   

}
