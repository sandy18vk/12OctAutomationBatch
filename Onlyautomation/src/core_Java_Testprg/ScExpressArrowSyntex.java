package core_Java_Testprg;

public class ScExpressArrowSyntex {

	public static void main(String args[]) {

		System.out.println("Choose an operation: +,-,*,/,%");
		int operator = '+';

		int num1 = 10;
		int num2 = 20;

		double result = switch (operator) {
		case '+' -> num1 + num2;
		case '-' -> num1 - num2;
		case '*' -> num1 * num2;
		case '/' -> num1 / num2;
		case '%' -> num1 % num2;
		default -> throw new IllegalArgumentException("Unexpected value: " + operator);

		};   // NOTE = semicolen must be used in arrow syntex
		
		
		System.out.println("The operation is addition: "+result);
		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Choose an operation: +,-,*,/,%");
//		
//		int operator = sc.nextInt();
//
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//
//		int result = switch (operator) {
//		case '+' -> num1 + num2;
//		case '-' -> num1 - num2;
//		case '*' -> num1 * num2;
//		case '/' -> num1 / num2;
//		case '%' -> num1 % num2;
//		default -> throw new IllegalArgumentException("Unexpected value: " + operator);
//
//		};
//		System.out.println(result);
//
//		
//		

	}

}
