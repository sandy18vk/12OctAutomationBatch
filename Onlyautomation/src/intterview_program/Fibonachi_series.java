package intterview_program;

public class Fibonachi_series {

	public static void main(String[] args) {

		int n = 5; // Number of terms
		int first = 0, second = 1;
		// 0 + 1 + 1+ 2+ 3......
		System.out.println("Fibonacci Series up to " + n + " terms:");

		for (int i = 1; i <= n; i++) {
			System.out.print(first + " ");
			// Calculate next number
			int next = first + second;
			first = second;
			second = next;

		}

	}
}
