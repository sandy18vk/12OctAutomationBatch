package Casting;

public class Castingchild extends Castingparent {

	int a = 20;
	
	Castingchild(){
		super(89);
	}

	void m1() {
		
		
		System.out.println("m1 from child");
		
	}

	
	public static void main(String[] args) {
		
		// runtime polymorphism - upcasting
		
		Castingparent p=new Castingchild();
		System.out.println(p.a);
		p.m1();
		
		
		//downcasting 
//		Castingchild p2=(Castingchild) new Castingparent();
//		System.out.println(p2.a);
//		p2.m1();
//		
	}
}
