package encapsulation;

public class Class2 {
	
	public static void main(String args[]) {
		
		Class1 c1=new Class1();
		System.out.println(c1.getA());
		
		c1.setA(90);
		
		System.out.println(c1.getA());
		
		
		c1.setprice(-100);
		System.out.println(c1.getprice());
		c1.setprice(10000);
		 System.out.println(c1.getprice());
		 c1.setprice(23);
		 System.out.println(c1.getprice());
	}
	

}
