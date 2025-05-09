package Arrayinjava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrayclass7 {

	public static void main(String[] args) {

		int array1[] = { 1, 2, 13, 3, 5, 11, 7, 8, 9, 10 };

		int array2[] = { 1, 2, 3, 5, 11, 7, 8, 9, 10 };

		System.out.println(Array.get(array1, 7)); // value of the gven index

		System.out.println(array1[2]); // 3
		Array.set(array1, 2, 98989);

		System.out.println((array1[2])); // 1000

		array1.equals(array2);

		System.out.println(array1.equals(array2)); // will compare the

		for (int a : array1) {
			System.out.println(a);
		}

		Arrays.sort(array1); // sort
		System.out.println("&&&&&&&&&&&");
		for (int a : array2) {
			System.out.println(a);
		}

	}

}
