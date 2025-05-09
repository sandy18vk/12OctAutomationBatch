package Z_Daily_practice;

public class Inheritance_Parent
{
	
	// Inheritance - is the oops concept in java mostly used in automation with selenium tool. 
	// it is acquiring the properies from one class to other class ,
	//parent class to child class with the help of extend key word 
	// we can used constructor , non static , static method in inheritance with  variable as well 
	
	// to perform the inheritanc we used extends keyword 
	// in inheritance there are 4 types - 1.single level 2.multilevel 3.multiple 4. herichacial inheritance 
	
	// single level - we perform the single in we required 2 classes in betw we perform the single level we used constructor , non static , static method in inheritance with  variable as well with extend key word 

	
	int a=20;
	int b=30;
	
	Inheritance_Parent(int h){
		System.out.println(h);
		a=45;
		System.out.println(a);
		b=12;
		System.out.println(b);
		System.out.println(" this is the constructor parent");
	}
	
	void m1() {
		System.out.println("m1 from class parent ");
	}
	
	static void m2() {
		System.out.println("m2 from class parent static ");
		
	}
}
