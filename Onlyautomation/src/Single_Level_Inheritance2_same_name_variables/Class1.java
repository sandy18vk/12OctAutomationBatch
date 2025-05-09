package Single_Level_Inheritance2_same_name_variables;

public class Class1 {
	
	int a;
	String s;
	
	Class1(int e,String h){
		a=9;
		s="super clas variable";
		System.out.println(e);
		System.out.println(h);
		System.out.println("class const parent");
	}

	void d1() {
		System.out.println("d1 method parent");
	}
}
