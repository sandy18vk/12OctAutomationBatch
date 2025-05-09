package intterview_program_Array;

import java.util.Arrays;

public class Find_Duplicate_from_Array {

	public static void main(String[] args) {

		int[] arr = { 3, 1, 2, 3, 4, 2, 5,5,6,6 };

		int size = arr.length;

		for (int i = 0; i <= size - 1; i++) {

			for (int j = i + 1; j <= size - 1; j++) {

				if (arr[i] == arr[j]) {

					System.out.println(arr[j]);
				}
			}
		}

	}

}
