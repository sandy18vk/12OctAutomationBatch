package array_Practice_prog;

public class FindtheMaximumandMinimuminanArray {

	public static void main(String[] args) {

		int a[] = { 23,  56, 3, 78, 12 };
		int max = a[0];
		int min = a[0];
		int size= a.length;
		for (int i = 1; i < size; i++) {
			if (a[i] > max) {  
				max = a[i];
			} else if (a[i] < min) {
				min = a[i];
			}
		}

		System.out.println("max number:" + max);

		System.out.println("min number:" + min);

	}

}
