package Interface;

public class Implementationclass implements Interface1, Interface2 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub

		System.out.println("m1 completed in implementation class ");
	}

	public void m2() {
		Interface1.super.m2();
		System.out.println("m2 override in  implementation class");
	}

	static void m3() {
		// System.out.println(a); // inherited from I1
		System.out.println("m3 static method  in  implementation class");

	}

	void m4() {
		System.out.println("m4 own method implementation class");

	}

	@Override
	public void m10() {
		Interface2.super.m10();
		System.out.println("m10 override in  implementation class");
	}

	public void m11() {
		Interface1.super.m2();
		Interface1.super.m10();

		Interface2.super.m2();
		Interface2.super.m10();

	}

}
