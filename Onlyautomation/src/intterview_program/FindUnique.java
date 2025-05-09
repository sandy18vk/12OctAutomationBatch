package intterview_program;

import java.util.HashSet;
import java.util.Set;

public class FindUnique {

	public static void main(String[] args) {
		
		String str="Sandeep";
		
		char[] ch =str.toCharArray();
		
		Set s =new HashSet<>(); //  s will accept unique value
		
		StringBuffer sb = new StringBuffer();
		
		for(char c:ch) {
			
			if(!s.contains(c)) {  // set check in c variable need to add
				s.add(c);  // adding 
				sb.append(c);  // string buffer methd 
			}
		}
		System.out.println(sb.toString());
		
	}

}
