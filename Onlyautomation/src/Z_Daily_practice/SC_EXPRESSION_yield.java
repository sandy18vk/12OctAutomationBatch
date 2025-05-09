package Z_Daily_practice;

public class SC_EXPRESSION_yield {
	
	public static void main(String[] args) {
		
		int operator='+';
		
		int num1=3;
		int num2=4;
		
		double result = switch (operator) {
		case '+': {
			System.out.println("addition");
			yield num1+num2;
		}
		
		case '-': {
			System.out.println("sub");
			yield num1+num2;
		}
		
		case '*': {
			System.out.println("*");
			yield num1+num2;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + operator);
		};
		System.out.println(result);
		
	}

}
