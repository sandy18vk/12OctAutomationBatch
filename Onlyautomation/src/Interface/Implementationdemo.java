package Interface;

interface shape {

	int lenght = 10; // final+static
	int width = 20; // final+static

	void circle(); // abstract method

	default void square() {
		System.out.println("this is square");
	}

	static void rectangle() {
		System.out.println("this is rectangle");
	}
}

public class Implementationdemo implements shape {

	int x = 35, y = 23;

	@Override
	public void circle() {
		// TODO Auto-generated method stub

		System.out.println("this is circle -abstarct method");

	}

	public void square() {
		System.out.println("this is square");
	}

	void trangle() {
		System.out.println("this is triangle");

	}

	public static void main(String[] args) {
		Implementationdemo hk = new Implementationdemo();
		hk.circle();
		hk.square();
		shape.rectangle();
		hk.trangle();
		System.out.println(hk.x * hk.y);

//		//shape sh = new Implementationdemo();
//		sh.circle();
//		sh.square();
//		shape.rectangle();
//
		System.out.println(shape.lenght * shape.width);

	}

}
