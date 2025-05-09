package pack2;

public class Class1 {

	public int a = 20; // within project
	protected int b = 30; // within package
	int c = 40; // within package
	private int d = 50; // within class
	
	//*****************************************************************************

	public static int e = 20;  // delcare using static keyword 
	protected static int f = 30;
	static int g = 40;
	private static int h = 50;
	
	//******************************************************************************
	
	// non static method

	public void m1() {

		System.out.println("m1 from class pack2");
	}

	protected void m2() {

		System.out.println("m2 from class pack2");
	}

	void m3() {

		System.out.println("m3 from class pack2");
	}

	private void m4() {

		System.out.println("m4 from class pack2");
	}
	
	//************************************************************************************

	// using static method 
	public static void m5() {

		System.out.println("m5 from class pack2");
	}

	protected static void m6() {

		System.out.println("m6 from class pack2");
	}

	static void m7() {

		System.out.println("m7 from class pack2");
	}

	static private void m8() {

		System.out.println("m8 from class pack2");
	}

}