package intterview_program_Array;

import java.util.Arrays;

public class FindtheMaximumandMinimuminanArray {

	public static void main(String[] args) {

		int arr[] = { 23, 1, 56, 3, 78, 12 };

		// Arrays.sort(arr);

		int size = arr.length;
		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i <= size - 1; i++) {

			if (arr[i] > max) {

				max = arr[i];

			}

			if (arr[i] < min) {
				min = arr[i];

			}
		}
		System.out.println("max number" + max);
		System.out.println("min number" + min);
	}
}
