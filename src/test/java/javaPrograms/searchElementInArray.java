package javaPrograms;

public class searchElementInArray {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50,60 };
		int search_ele = 50;
		boolean flag = false;

		for (int i = 0; i < a.length; i++) {
			if (search_ele == a[i]) {
				System.out.println("Element found at:" + a[i]);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Element Not found");
		}
	}

}
