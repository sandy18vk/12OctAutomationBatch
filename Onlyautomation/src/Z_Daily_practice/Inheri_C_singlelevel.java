package Z_Daily_practice;

public class Inheri_C_singlelevel extends Inheri_P_singlelevel {

	int b;
	String s2;

	Inheri_C_singlelevel() {
		super(100, "tu dog");
		System.out.println("child const");
		b = 34;
		s2 = "sam";

	}

	void m2() {
		System.out.println(super.a);
		System.out.println(super.s);
		super.m1();
		System.out.println("parent m2 method");
	}
}
