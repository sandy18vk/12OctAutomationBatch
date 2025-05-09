package intterview_program;

import java.util.HashSet;
import java.util.Set;

import Collection.HasSetDemo;

public class Remove_Duplicate_String {
	
	public static void main(String[] args) {
		
		String s="automation test Engineer";
		
		//exp o/p= Sandp;
		
		char [] c= s.toCharArray();
		
		Set set =new HashSet<>();  //store only unique char
       //sandp
		
		StringBuilder sb= new StringBuilder();
		for(char ch: c) {
			
			if(!set.contains(ch)){
				set.add(ch);
				sb.append(ch);
			}
			
		}
		System.out.println(sb.toString());
	}
}
