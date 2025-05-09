package Arrayinjava;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } }; // array format

//		System.out.println(s[0][1]);
//     	System.out.println(s[1][1]);

		for (int i = 0; i <= 2; i++) {

		
		for (int j = 0; j <= 2; j++) {

			//int i = 0;
			System.out.print(s[i][j] + " ");
		}
			System.out.println();
		}

		String name[] = { "sandeep", "sushant", "rohan", "virat" };
		System.out.println(name.length);
		System.out.println(name[0]);

		int rollno[] = { 10, 20, 30, 40 };

		System.out.println(rollno[0]);

		char letter[] = { 'r', 'y', 'u', 'o' };
		System.out.println(letter[1]);

	}
}
