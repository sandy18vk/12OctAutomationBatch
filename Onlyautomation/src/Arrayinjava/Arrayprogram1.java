package Arrayinjava;

import java.util.Arrays;

public class Arrayprogram1 {
	
	
	//input: 1 missing (2 missing) 
	
	public static void main(String[] args) {
		
	int array1[]= {10,12,11,14, 16,17};
	
	Arrays.sort(array1);
	
	for(int i=0; i< array1.length; i++) {
		
		if(array1[i] != array1[i+1]-1) {
			System.out.println(array1[i+1]-1);
			break;
		}
	}
	

}
}
