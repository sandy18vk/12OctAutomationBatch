package core_Java_Testprg;

public class Datatypes {

	public static void main(String[] args) {
		

		// without decimal number  
		// syntex - datatype ref varaiable = value /info;
		byte x = 3; // 1 byte
		System.out.println("the value of x:" + x);

		int a = 100;  // 4 byte
		int b = 200;
		System.out.println("the value of a:" + a);

		System.out.println("the value of b:" + b);

		System.out.println("addtion of a and b:"+ (a + b));
		System.out.println("addtion of a and b:"+ (a - b));
		System.out.println("addtion of a and b:"+ (a % b));
		System.out.println("addtion of a and b:"+ (a * b));
		System.out.println("addtion of a and b:"+ (a / b));
 
		short d = 456;  // 2 byte
		System.out.println("the value of d:" + d);

		long s = 5464664646464l; // 8 byte
		System.out.println("the value of s:" + s);
		
//******************************************************************************************************************		

		// with decimal number
		float t = 23.87f; //  4 byte
		System.out.println("the value of t:" + t);

		double q = 65656566566.778875878758578;  //8 byte
		System.out.println("the value of q:" + q);

	}

}
