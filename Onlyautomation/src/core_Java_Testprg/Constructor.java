package core_Java_Testprg;

public class Constructor {

	int a = 10;
	int b = 20;
	char c='p';
	String s8="RCB";

	Constructor() {

	}

	Constructor(int l1, int x3) {
		a = l1;
		b = x3;

	}

	Constructor(int k1, int k2, String s3) {
		a = k1;
		b = k2;
		s8 = s3;

	}

	Constructor(int d3, char f) {
		a = d3;
		c = 't';
	}

	public static void main(String args[]) {
		Constructor g = new Constructor(567, 'u');
		System.out.println(g.a);
		System.out.println(g.b);
		System.out.println(g.c);
		System.out.println(g.s8);

		System.out.println();

		Constructor j = new Constructor(789, 54, "money");
		System.out.println(j.a);
		System.out.println(j.b);
		System.out.println(j.s8);
		
		System.out.println();

		Constructor n = new Constructor(345, 890);
		System.out.println(n.a);
		System.out.println(n.b);
		System.out.println(n.c);
		System.out.println(n.s8);

		System.out.println();
		Constructor m = new Constructor();
		System.out.println(m.a);
		System.out.println(m.b);
		System.out.println(m.c);
		System.out.println(m.s8);
		
	}

}
