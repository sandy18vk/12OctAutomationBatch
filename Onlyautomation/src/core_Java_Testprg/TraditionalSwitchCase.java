package core_Java_Testprg;

import java.util.Scanner;

public class TraditionalSwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose an operation case: (+,-,*,/,%_)");
		
		System.out.println("Enter the number 1: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the number 2: ");
		int num2 = sc.nextInt();
		
						
		System.out.println("Enter the case number:");
		int operator = sc.nextInt();

		int result;
		switch (operator) {
		case 1:
			result = num1 + num2;
			System.out.println("Get the o/p:>>"+ result);
			break;
		case 2:
			result = num1 - num2;
			System.out.println("Get the o/p:>>"+ result);
			break;
		case 3 :
			result = num1 / num2;
			System.out.println("Get the o/p:>>"+ result);
			break;
		case 4:
			result = num1 * num2;
			System.out.println("Get the o/p:>>"+ result);
			break;
		default:
			System.out.println("Invalid operation");
			return;
		}
		//System.out.println(result);
    //System.out.println(num1+""+operator+""+num2+"="+result);
	}

}
