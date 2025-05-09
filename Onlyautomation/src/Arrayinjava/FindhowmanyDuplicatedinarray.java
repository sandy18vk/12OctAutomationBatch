package Arrayinjava;

public class FindhowmanyDuplicatedinarray {

	public static void main(String[] args) {
		

		int array[] = { 100, 200, 100, 567,100, 98, 100, 89,98, 100, 200 };
		int count = 0;
		int num = 98;

		for (int value : array) {

			if (value == num) {

				count++;
			}

		}

		System.out.println(count);
		
	}

}
