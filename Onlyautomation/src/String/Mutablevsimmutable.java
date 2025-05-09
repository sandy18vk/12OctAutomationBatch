package String;

import java.util.Arrays;

public class Mutablevsimmutable {

	public static void main(String[] args) {
		

		//mutable = can change
		
		int a[]= {20,50,80,45,34};
		
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		
		// immutable = we cannot change
		
		String s=new String("welcome");
		System.out.println(s);
		
		String s1=s.concat("to java");
		
		System.out.println(s1);
		
	}

}
