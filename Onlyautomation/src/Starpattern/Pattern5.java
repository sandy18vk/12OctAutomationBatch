
package Starpattern;

public class Pattern5 {

	public static void main(String args[]) {

		for (int i = 5; i > 0; i--) {

			for (int j = 1; j <= i - 1; j++) {
				System.out.print("  ");
			}

			for (int k = 5; k > i - 1; k--) {
 
				System.out.print("* ");
			}

			System.out.println();

		}

		// left angle triangle

		for (int i = 0; i < 5; i++) {
			
			for (int j = 5-i; j>1; j--) {
				System.out.print("  ");
			}
			
			for (int k = 0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
