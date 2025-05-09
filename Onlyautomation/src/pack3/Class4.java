package pack3;

import pack2.Class1;

public class Class4 {
	
	void m7() {
		Class1 nm=new Class1();
		System.out.println(nm.a);
		System.out.println(Class1.e);
		nm.m1();
		Class1.m5();
	}
	public static void main(String[] args) {
		Class4 c4=new Class4();
		
		c4.m7();
	}

}
