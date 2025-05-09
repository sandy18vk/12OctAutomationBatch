package intterview_program;

public class Swaping_without_Thired_num {
	
	public static void main(String[] args) {
		
		int a=10;
		
		int b=20;
		
		int c;
		
//	//	System.out.println("before swaping = "+ a+ " "+ b);
		
		
//		
//		c= a+b; // 10+20 =30
//		
//		a=c-a; // 30-10 =20
//		
//		b=c-b; // 30-20 =10
//		
//		System.out.println("after swaping "+ a+ " "+ b);
//	}
	
	// without using arithamatic operator

		
//		c= a^b; // 10+20 =30
//		
//		a=c^a; // 30-10 =20
//		
//		b=c^b; // 30-20 =10
//		
//		System.out.println("after swaping "+ a+ " "+ b);
		
		// without using thired variable 
		
		
		a= a+b;  // 30
		
		b=a-b;  // 10
		
		a=a-b; // 20
		
		System.out.println("after swaping without using third variable "+a+ " "+ b);
}}
