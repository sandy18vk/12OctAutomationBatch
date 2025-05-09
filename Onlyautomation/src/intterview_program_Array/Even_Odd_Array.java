package intterview_program_Array;

import java.util.Arrays;

public class Even_Odd_Array {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

		int size = arr.length;

		System.out.println(size);

		for (int i = 0; i < size; i++) {

			if (arr[i] % 2 == 0) {

				System.out.println("even number" + arr[i]);

			} else {

				if (arr[i] % 2 != 0)
					;

				System.out.println("odd number" + arr[i]);
			}
		}

	}
}
