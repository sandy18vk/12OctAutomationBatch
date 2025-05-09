package Arrayinjava;

public class evenoddfromarray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6 };

		// extarcting even number

//		System.out.println("even number in array");
//
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] % 2 == 0) {
//				
//				System.out.println(a[i]);
//
//			}
//		}
//		System.out.println("odd number in array");
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] % 2 != 0) {
//				
//				System.out.println(a[i]);
//
//			}
//		}

		for (int x : a) {

			if (x % 2 == 0)
				System.out.println(x);
			

		}
		System.out.println("odd number in array");

		for (int y : a) {
			if (y % 2 != 0)
				System.out.println(y);
		}

	}
}
