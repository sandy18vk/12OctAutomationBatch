package intterview_program_Array;

public class MissingArrayNum {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 4, 5, 7 };

		int max = 7;

		boolean[] present = new boolean[max+1 ]; // max digit of array ex -7 so index star from 0

		for (int a : arr) {
			present[a] = true; // 0 ,3,6
		}

		for (int i = 1; i <= max; i++) {
			if (!present[i]) {
				System.out.println(i);
			}
		}
		
	}
	
}
