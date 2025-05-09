package pack3;

import pack2.Class1;

public class Class5 extends Class1 {

	void m8() {
		Class1 lk = new Class1();
		System.out.println(lk.a);
		System.out.println(Class1.e);
		lk.m1();

	}

	void m9() {
	}

	public static void main(String args[]) {

		Class5 op = new Class5();
		System.out.println(op.a);
		System.out.println(op.b);

		System.out.println(Class1.e);
		System.out.println(Class1.f);

		op.m1();
		op.m2();

	}

}