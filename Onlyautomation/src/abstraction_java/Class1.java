package abstraction_java;

public abstract  class Class1 {  // using abstract keyword abstract class
	int a;
	
	Class1(int a ){ // constructor
		this.a=a;
	}
	
	void m1() { // complete method
		
		System.out.println("m1 from abstract method");
	}
	
	abstract  void m2();  //  abstract methods
	

	
	
	
}
