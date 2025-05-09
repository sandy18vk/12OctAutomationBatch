package Interface;

public interface Interface2 {
	
	int a=1000;

	 void m1();  // public abstact 
	// void m2();
	 //from java8
	 default void m2() {
		 System.out.println("m2 default from interface 2");
	 }
	 
	 static void m3() {
		 System.out.println("m3 default from interface 2");

	 }
	 
	 default void m10() {
		 System.out.println("m10 default from interface 2");
	 }


}
