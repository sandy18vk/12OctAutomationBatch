package Arrayinjava;

public class Sumofarray {

	public static void main(String[] args) {

		int a[] = { 5, 2, 7, 9, 6 }; // n=5 n-1=4
		int sum = 0;
//		for (int i = 0; i <= a.length - 1; i++) { // a.length-1=4
//
//			sum = sum + a[i]; //
//
//		}
//
//		System.out.println(sum);

		for (int value : a) {
			sum = sum + value;

		}

		System.out.println("Sum of the arrays: "+ sum);
	}

}
