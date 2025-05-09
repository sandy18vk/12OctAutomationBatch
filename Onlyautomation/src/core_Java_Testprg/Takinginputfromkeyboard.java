package core_Java_Testprg;

import java.util.Scanner;

public class Takinginputfromkeyboard {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your city");

//		int num1 = sc.nextInt();
//
//		System.out.println(num1);
		
		String city=sc.next();
		
		System.out.println("your city is: "+city);

	}
}
