package Arrayinjava;

public class Arrayinjava2 {

	public static void main(String[] args) {
	

		int array2[] = { 1, 2, 3, 5, 6, 9 };

		
		
////		for (int i = 0; i <= 6; i++) {
//			System.out.println(array2[4]);
//		}

			System.out.println(array2.length); // size // index=size-1

		

		for (int i = 0; i < array2.length; i++) { // size

			System.out.println(array2[i]);

		}
		System.out.println("*************");
		for(int k : array2 ) {
			System.out.println(k);
		}

	}

}
