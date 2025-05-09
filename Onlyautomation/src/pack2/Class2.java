package pack2;

public class Class2 {

	void m5() {
		Class1 c1 = new Class1();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);

		// System.out.println(c1.d);// can't access (private)
		c1.m1();
		c1.m2();
		c1.m3();

		// c1.m4(); //can't access (private)

		System.out.println(Class1.e);
		System.out.println(Class1.f);
		System.out.println(Class1.g);

		// System.out.println(c1.h);//can't access (private)
		Class1.m5();
		Class1.m6();
		Class1.m7();

		// Class1.m8();//can't access (private)

	}

	public static void main(String args[]) {
		Class2 mn = new Class2();
		mn.m5();
	}
}
