package array_Practice_prog;

import java.util.Arrays;

public class Array_Missing_Number {
	
	public static void main(String[] args) {
		
		int array1[]= {1, 2, 4, 5, 6, 8,10};
		
		Arrays.sort(array1);
		
		
		for(int i=0; i<array1.length-1;i++) {
			
			if(array1[i]!=array1[i+1]-1) {
				
			System.out.println(array1[i+1]-1);
				
			}
		}
	}
}
	
	

		
			


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	int array1[]=  {1,2,4,5,6}; // 3
//	int array2[]= {3,1,7,8,4,5}; //6
//	int array3[]= {2,3,5,6}; // 4
//	
//	Arrays.sort(array2);
//	1,2,
//
//	for(int i=0; i< array2.length; i++) {
//		
//		if(array2[i] !=array2[i+1]-1) {
//           1 != [0+1]-1
//           1 != 1-1
 //          1 !=0
//			System.out.println(array2[i+1]-1);
//			break;
//						
//		}
//		
//	}
//}





