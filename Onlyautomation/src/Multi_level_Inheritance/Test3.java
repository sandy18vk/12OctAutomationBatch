package Multi_level_Inheritance;

public class Test3 extends Test2 {

	String var5 = "var5 from test2";
	static String var6 = "var6 from test2";

	void m5() {
		System.out.println("m5 from test3 instance m");
	}

	static void m6() {
		System.out.println("m6 from test3 static m");
	}

}
