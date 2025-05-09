package exception_handling;

public class exceptionhandlingeg {

	public static void main(String[] args) {

		Object array1[] = { "selenium", 78, 56.98, 'u' };

		try {
			System.out.println(array1[9]);
		} 
//			catch (ArrayIndexOutOfBoundsException i) {
//				System.out.println("ArithmeticException found");
//			}
//		catch (Exception e) {
//			System.out.println("not found");
//		}
		 finally {
			System.out.println("finally block ");

		}

	}

}
