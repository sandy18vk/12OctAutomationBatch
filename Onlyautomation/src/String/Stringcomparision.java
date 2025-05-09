package String;

public class Stringcomparision {

	public static void main(String[] args) {
		
		//scenario 1
		
		String s1="welcome";
		String s2="welcome";
		
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
//		
//		//scenario 2
//		
//		String s3=new String("WELCOME");
//		String s4=new String("WELCOME");
//		
//		System.out.println(s3==s4); // to compare the object
//		
//		System.out.println(s3.equals(s4));
//		
//		System.out.println(s1.equalsIgnoreCase(s4));
//		
//		System.out.println(s3.endsWith(s4)); // to compare the values of object
		
		
		//scenarios 3
//		String s5="abc";
//		String s6=new String("abc");
//		
//		System.out.println(s5==s6);
//		System.out.println(s5.equals(s6));
		
		// scenarios 4
		
		String s7="abc";  // constant 
		String s8=new String("abc"); // non const with creat object using new key 
		String s9 =s8;
		
		//System.out.println(s7==s8); // false    
		//System.out.println(s7.equals(s8)); // true
		
		System.out.println(s9==s8); // false
		//System.out.println(s8.equals(s9)); // true
		
	    System.out.println(s9==s7);  // false  // true
		//System.out.println(s7.equals(s9)); // true

		
		
		
	}

}
