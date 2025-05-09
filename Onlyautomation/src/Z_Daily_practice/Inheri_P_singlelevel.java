package Z_Daily_practice;

public class Inheri_P_singlelevel {

	int a;
	String s;

	Inheri_P_singlelevel() {
		System.out.println("non para constructor");
		a = 9;
		s = "fuck";

	}

	Inheri_P_singlelevel(int h) {
		System.out.println(h);
		System.out.println("1 para constructor");
		a = 50;
		s = "life";

	}

	Inheri_P_singlelevel(int v,String d) {
		System.out.println(d);
		System.out.println(v);
		System.out.println("2 para constructor");
		a = 6;
		s = "thvs";

	}

	void m1() {
		System.out.println("parent m1 method");
	}

}
