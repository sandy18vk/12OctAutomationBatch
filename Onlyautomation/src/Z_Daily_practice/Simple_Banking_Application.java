package Z_Daily_practice;

import java.util.Scanner;

public class Simple_Banking_Application {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the account balance");

		int Balance = sc.nextInt();
				
		if(Balance>1000) {
			System.out.println("You have a good balance");
		}
		else if(Balance>=500 && Balance<=1000 ) {
			System.out.println("Your balance is moderate");
		}
		else if(Balance<500) {
			System.out.println("You need to deposite more money");
		}
		else {
			System.out.println("Maintane your balance");
		}
	}

}
