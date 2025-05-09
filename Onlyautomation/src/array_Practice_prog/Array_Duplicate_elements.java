package array_Practice_prog;

import java.util.Arrays;

public class Array_Duplicate_elements {

	public static void main(String[] args) {

		//int array1[] = { 3, 1, 2, 3, 4, 2, 5,5 };
		int array2[] = {1, 4, 4, 2, 5, 2, 6};
		Arrays.sort(array2);
		
		for(int i=0; i<array2.length;i++) {
			
			for(int j=i+1;j<array2.length;j++) {
				
				if(array2[i]==array2[j]) {
					
					System.out.println("find duplicate:"+array2[j]);
				}
			}
		}

	}}
