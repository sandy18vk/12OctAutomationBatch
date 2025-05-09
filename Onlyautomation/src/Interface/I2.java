package Interface;

public interface I2 extends I1 {

	abstract void m1();

	static void m2() {

		System.out.println("m2 from I2");

	}

	default void m3() {
		System.out.println("m3 from I2");
	}

}
