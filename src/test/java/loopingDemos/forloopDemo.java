package loopingDemos;

public class forloopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,20,30,40,50};
		
		/*
		 * for(int i=0;i<arr.length;i++) {
		 * 
		 * System.out.println(arr[i]); }
		 */
		/*
		 * int i =0;//variable declaration +assigining the value i<arr.length//condition
		 * i++//increment
		 */	
		//enhanced for each  loop 
		for(int array:arr) {
			System.out.println(array);
		}
		
		String[] str= {"test2","test4"};
		for(String s:str) {
			
			System.out.println(s);
		}
	}


}
