package intterview_program_Array;

import java.util.Arrays;

public class Find_second_largest_number {
	
	public static void main(String[] args) {
		
	int [] arr= {10, 10, 20, 30, 40};
	
	Arrays.sort(arr);
	
	int size =arr.length;
	
	int largest =arr[size-1];

//	System.out.println(largest);
	
	for(int j=size-1;j>=0;j--) {
		if(arr[j]!=largest) {
			System.out.println(arr[j]);
			break;
		}
	}
	
	}
	

}
