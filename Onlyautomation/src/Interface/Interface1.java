package Interface;

public interface Interface1 {
	
	//public static final 
	int a=10;

	 void m1();  // public abstact 
	// void m2();
	 //from java8
	 default void m2() {
		 System.out.println("m2 default from interface 1");
	 }
	 
	 static void m3() {
		 System.out.println("m3 default from interface 1");
 
	 }
	 
	 default void m10() {
		 System.out.println("m10 default from interface 1");
	 }
	
	 
}
