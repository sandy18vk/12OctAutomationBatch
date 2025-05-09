
package Interface;

public  class Impclass implements I2, I1 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub

		System.out.println("m1 method implemented in impclass ");
		// 
		
		//I2.super.m1();

	}

	static void m2() {

		System.out.println("m2 method implemented impclass");

	}

	public void m3() {
		System.out.println("m3 from I1 in implemented class");

		I2.super.m3();
		I2.super.m3();

	}

}
