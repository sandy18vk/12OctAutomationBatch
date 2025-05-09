package core_Java_Testprg;

import java.util.Scanner;

public class TSwitchcaseString {

	public static void main(String args[]) {
		
	//	Scanner sc=new Scanner(System.in);
		
		System.out.println("Get the statmnet of account :");
		
	//	String trasactiontype = sc.next();

		String trasactiontype = "withdrawl";
		switch (trasactiontype) {

		case "withdrawl":
			System.out.println("amount transaction withdrawal");
			break;

		case "deposite":
			System.out.println("amount transaction deposite");
			break;

		case "balance enquiry":
			System.out.println("checking account balance");
			break;

		case "pin change":
			System.out.println("processing pin change request");
			break;

		default:
			System.out.println("invalid transaction type");
		}
	}

}
