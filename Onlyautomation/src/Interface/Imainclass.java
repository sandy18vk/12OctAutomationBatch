package Interface;

public class Imainclass {

	public static void main(String[] args) {

		Impclass hk = new Impclass();
		hk.m1();
		Impclass.m2(); // call static method
		hk.m3();

	}

}
