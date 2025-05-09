package core_Java_Testprg;

public class Variables {

	int variable2; // Global , instance , object , non static variable

	static int variable3; // Global, class , Static variable

	final int variable4 = 0; // final+global+instance , final+non static

	final static int variable5 = 40;// final+global/ final+class/ final+static

	Variables(int variable2, int variable3, int variable4, int variable5) {
		int variable10 = 10; // local+non static
		final int variable20 = 20;// final+local+nonstatic
		System.out.println("//Printing the values without initializing any value");
		System.out.println(this.variable2);
		System.out.println(this.variable3);
		System.out.println(this.variable4);
		System.out.println(this.variable5);

		System.out.println("Printing the parameters values");
		System.out.println(variable2);
		System.out.println(variable3);
		System.out.println(variable4);
		System.out.println(variable5);

		System.out.println("Printing the  values local variables");
		System.out.println(variable10);
		System.out.println(variable20);

		System.out.println("assign the values of parameters to global variables of same name");
		this.variable2 = variable2;
		this.variable3 = variable3;

		System.out.println("printing values of global variables after assigning the values");
		System.out.println(variable2);
		System.out.println(variable3);
		System.out.println();
	}

	void m4() {
		int variable2 = 34;

		System.out.println(variable2);
		System.out.println(variable3);
		System.out.println(variable4);
		System.out.println(variable5);
		System.out.println();
	}

	static void s7() {

		System.out.println(variable3);

		System.out.println(variable5);
	}

	public static void main(String[] args) {

		Variables fr = new Variables(71, 72, 73, 74	);
		
		fr.m4();

		fr.s7();
	}
}
