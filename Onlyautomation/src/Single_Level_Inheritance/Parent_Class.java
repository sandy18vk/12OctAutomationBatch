package Single_Level_Inheritance;

public class Parent_Class {

	int a;
	String s;

	Parent_Class() { // constructor zero args
		System.out.println("parent class");
		a = 10000;
		s = "Test";
	}

	Parent_Class(int h) { // const 1args
		System.out.println(h);
		System.out.println("parent class parameterized 1 con");
		a = 50;
		s = "OOPS";
	}
	
	Parent_Class(int l,String g) { // const 2 args
		System.out.println(l);
		System.out.println(g);
		System.out.println("parent class parameterized 2 con");
		a = 90;
		s = "dffgg";
	}

	void m1() {
		System.out.println("m1 is non static method parent");
	}

}
