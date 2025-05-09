package core_Java_Testprg;

public class methods {
	int a = 1;
	int b=1;
	int c=1;
	

public int m1() {
		System.out.println("int instance method");
	if (a < 7) {
		a++;
		return m1();
	}
	return 567;
	}
	
	public float m2() {
		System.out.println("float instance method");
		if (b < 1) {
			b++;
			return m2();
		}
		return 78.98f;
	}
	public double m3() {
		System.out.println("double instance method");
		if (c< 4) {
			c++;
			return m3();
		}
		return 566566566.989;
	}
	public long m4() {
		System.out.println("long instance method");
		short d = 1;
		if (d < 4) {
			d++;
			return m4();
		}
		return 35;
	}
	
	public short m5() {
		System.out.println("short instance method");
		short e = 0;
		if (e < 2) {
			e++;
			return m5();
		}
		return (short) e;
	}
	public String m6() {
		System.out.println("String instance method");
		int e = 0;
		if (e < 2) {
			e++;
			return m6();
		}
		return "sandeep";
	}
	
	public boolean m7() {
		System.out.println("boolean instance method");
		int f = 0;
		if (f <= 2) {
			f++;
			return m7();
		}
		return true;
	}

	public void m8() {
		System.out.println("instance method");
	}

	public static void main(String args[]) {
		methods jk = new methods();
	
//		System.out.println(jk.m1());
		System.out.println(jk.m2());
//	System.out.println(jk.m3());
//		System.out.println(jk.m4());
//	System.out.println(jk.m5());
//	System.out.println(jk.m6());
//	System.out.println(jk.m7());
	
	}

}
