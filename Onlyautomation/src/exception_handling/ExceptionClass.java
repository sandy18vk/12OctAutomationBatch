package exception_handling;

public class ExceptionClass {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		int div = 0;
	//	System.out.println(a);
//		System.out.println(b);
		//div = a / b;

		try {
			div = a / b;
		} catch (ArithmeticException e) {

			System.out.println("division not possible");
		}
		
		finally {
			System.out.println("finally print this");
		}
		System.out.println("handling");
	}

}
