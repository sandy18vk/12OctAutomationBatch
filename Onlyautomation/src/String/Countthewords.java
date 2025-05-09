
package String;

import java.util.Scanner;

public class Countthewords {

	public static void main(String[] args) {

		System.out.println("enter the string");

//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
		
		
		String s1 = "selenium are most used in java";
		int count = 1;
		for (int i = 0; i < s1.length() - 1; i++) {

			if ((s1.charAt(i) == ' ') && (s1.charAt(i + 1) != ' ')) {

				count++;

			}

		}

		System.out.println(count);

	}

}
