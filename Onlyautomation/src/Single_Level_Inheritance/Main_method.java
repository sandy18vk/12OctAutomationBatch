package Single_Level_Inheritance;

public class Main_method {

	public static void main(String[] args) {
		
		Child_class ts=new Child_class();
		System.out.println(ts.a);
		System.out.println(ts.s);
		System.out.println(ts.b);
		System.out.println(ts.s2);
		ts.m2();
		System.out.println("*****************");
		ts.m1();
		System.out.println(ts.a);
		System.out.println(ts.s);
		
	}

}
