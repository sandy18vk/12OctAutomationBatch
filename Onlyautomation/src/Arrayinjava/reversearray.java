package Arrayinjava;

import java.util.Arrays;

public class reversearray {

	public static void main(String[] args) {

		int a[] = { 200, 500, 200, 100, 200, 300, 400, 500 };
		Arrays.sort(a);

		for (int d : a) {
			System.out.println(d);
		}

		System.out.println("*************************");

		for (int i = a.length - 1; i >= 0; i--) {

			System.out.println(a[i]);
			Arrays.sort(a);

		}

	}

}
