package Z_Daily_practice;

public class if_conditional {

	public static void main(String[] args) {

		int a = 25; // datatype declaration +initialaization
		int age = 10; // datatype declaration

		if (a >= age) { // if contion is true the the will execute , if contion false then contion will
						// not print in console

			System.out.println(" if statment pass ");

			if (a <= age) {
				System.out.println("if block 2");
			} else {
				System.out.println("if else block 1");
			}

		}else {
			System.out.println("if else block 2");
		}
	}

}
