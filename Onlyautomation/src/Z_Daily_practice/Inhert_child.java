package Z_Daily_practice;

public class Inhert_child extends Inheritance_Parent {

	 int a=34;
	 int b=9;
	 
	 Inhert_child(){
		 super(88);
		  a=23;
		  b=45;
		 System.out.println(" this is constructor chid");
	 }
	 void m3() {
			System.out.println("m3 from class parent ");
			System.out.println(super.a);

			System.out.println(super.b);
			
			m1();
			m2();
			m4();

		}
		
		static void m4() {
			System.out.println("m4 from class parent static ");
			
		}
		
		public static void main(String[] args) {
			
			Inhert_child ch=new Inhert_child();
			ch.m3();  // non static method 
			
			Inhert_child.m2();  // static method 
			Inhert_child.m4();
			
			System.out.println(ch.a);
			System.out.println(ch.b);
			
			
		}
	

}
