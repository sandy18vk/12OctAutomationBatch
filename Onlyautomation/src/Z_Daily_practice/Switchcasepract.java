package Z_Daily_practice;

import java.util.Scanner;

public class Switchcasepract {

	public static void main(String[] args) {
		
		System.out.println("To perform arithmatic operation");
		
		Scanner sc=new Scanner(System.in);
		int result1= sc.nextInt();
		double result2	=sc.nextDouble();

		int a = 23;
		int b = 45;

		int opt = '+';  // what have to perform in condition statmnet declared in format datatype and operation

		int resul = 0;

		switch (opt) {  // condition must required 

		case '+':
			result1 = a + b;

			System.out.println("addition of two number:" + result1);
			break;

		case '-':
			result1 = a - b;

			System.out.println("substraction of two number:" + result1);
			break;

		case '*':
			result1 = a * b;

			System.out.println("multiplication of two number:" + result1);
			break;
		case '/':
			result1 = a / b;

			System.out.println("div of two number:" + result1);
			break;

		case '%':
			result1 = a % b;

			System.out.println("module of two number:" + result1);
			break;
		default:
			System.out.println("Not getting the output");

		}

	}

}

////switch() {
//
//case 1: break ;
//	code //
//	sys ;
//	
//case 2:
//	code //
//	sys ;
//
//case 3:
//	code //
//	sys ;
//
//case 4:
//	code //
//	sys ;
//
//case 5:
//	code //
//	sys ;
//
//case 6:
//	code //
//	sys ;
//	
//	default:
//		sys;
//
//}
