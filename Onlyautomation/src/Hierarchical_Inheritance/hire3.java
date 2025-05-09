package Hierarchical_Inheritance;

public class hire3 extends hire1 {
	String var5 = "var5 from test2";
	static String var6 = "var6 from test2";

	void m5() {
		System.out.println("m5 from test3 instance m");
		m1();
		m2();
		m6();
//		m3();
//		m4();
	}

	static void m6() {
		System.out.println("m6 from test3 static m");
	}


}
