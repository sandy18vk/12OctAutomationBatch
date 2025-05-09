package exception_handling;

public class Excephandv {

	public static void main(String[] args) {

		String s = "Selenium";

		try {

			s.charAt(20); // risky code

		}

		catch (IndexOutOfBoundsException i) {
			System.out.println("IndexOutOfBoundsException");
		}

		catch (NullPointerException i) {
			System.out.println("NullPointerException");
		}

		catch (NumberFormatException i) {
			System.out.println("NumberFormatException");
		}

		finally {
			System.out.println("finally");

		}

		System.out.println("Excephandv");

	}

}
