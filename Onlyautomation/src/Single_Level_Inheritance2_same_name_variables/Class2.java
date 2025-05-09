

package Single_Level_Inheritance2_same_name_variables;

public class Class2 extends Class1 {
	
	int a;
	String s;
	
	Class2(){
		super(67,"rome");
		a=23;
		s="sub clas variable";
		System.out.println("class const child");
	}

	void d1() {
		System.out.println("d1 method child");
		System.out.println(super.s);
		System.out.println(super.a);
		super.d1();
	}

}
