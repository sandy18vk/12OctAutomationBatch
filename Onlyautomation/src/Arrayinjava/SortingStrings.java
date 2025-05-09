
package Arrayinjava;

import java.util.Arrays;

public class SortingStrings {

	public static void main(String[] args) {

		char s[] = { 'd', 'c', 'b', 'a' };
		
		String c[]= {"sandeep","rahul","raj","deepak"};

		System.out.println("befor sorting....." + Arrays.toString(s));

		Arrays.sort(s);

		System.out.println("after sorting....." + Arrays.toString(s));
		 
		System.out.println("&&&&&&&&&&&&&&&&&&&&");
		
		System.out.println("befor sorting....." + Arrays.toString(c));

		Arrays.sort(c);

		System.out.println("after sorting....." + Arrays.toString(c));

		

	}

}
