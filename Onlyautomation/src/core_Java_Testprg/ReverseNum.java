package core_Java_Testprg;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {

		Scanner de = new Scanner(System.in);
		System.out.println("enter the number");

		int num = de.nextInt();

		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		System.out.println("reverse num is :" + rev);
	}

}
