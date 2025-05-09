package intterview_program;

public class Prime_number_orNot {

	public static void main(String[] args) {

		int a = 11; // 1 and 0 diveide the the number should be prime

		boolean isprime = true;

		for (int i = 2; i <= a / 2; i++) {

			if (a % i == 0) {

				isprime = false;
				break;
			}

		}
		if (isprime) {
			System.out.println("number is prime" + a);
		} else {
			System.out.println("not prime" + a);
		}

	}

}
