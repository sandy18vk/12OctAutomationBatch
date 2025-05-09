package Arrayinjava;

public class Searchingelementinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 20, 30, 40, 50 };

		int search_elements = 30;

		boolean status = false; // false -not found true-found

//	/*	for(int i=0;i<a.length;i++) {
//			
//		//	System.out.println(a[i]);
//			
//			if(a[i]==search_elements) {
//				System.out.println("element found");
//				status=true;
//				break;
//			}
//		}
//		
		for (int x : a) {

			if (x == search_elements) {
				System.out.println("element found");
				status = true;
				break;
			}

		}

		if (status == false) {

			System.out.println("element not found");
		}
	}

}
