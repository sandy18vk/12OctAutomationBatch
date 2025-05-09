package encapsulation;

public class Class1 {

	private int a = 20;

	private int price = 40;

	public void setA(int a) {

		this.a = a;

	}

	public int getA() {

		return a;

	}

	public void setprice(int price) {

		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("enter valid peice amount");
		}

	}

	public int getprice() {

		return price;

	}

}
