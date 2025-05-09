package Single_Level_Inheritance;

public class Child_class  extends Parent_Class{ 
	
	int b;
	String s2;
	
	Child_class(){
		super(78,"prove");
		System.out.println("it's a Child class");
		b=10;
		s2="Test";
	}
	
	void m2() {
		System.out.println(super.s);
		System.out.println(super.a);
		
		super.m1();
		System.out.println("m2 is non static method child");
	}


}
