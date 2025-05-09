package core_Java_Testprg;

public class SwitchCaseExpression {

	public static void main(String args[]) {

		char operator = '+';
		int num1 = 10;
		int num2 = 30;
		double result = switch (operator) {
		case '+': {
			System.out.println("Addition");

			yield num1 + num2;
		}

		case '-': {
			System.out.println("sub");

			yield num1 - num2;
		}
		case '*': {
			System.out.println("Mul");

			yield num1 * num2;
		}
		case '/': {
			System.out.println("Div");

			yield num1 / num2;
		}
		
		case '%': {
			System.out.println("module");
			yield num1 % num2;
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + operator);
		};
		System.out.println(result);
	}

}
