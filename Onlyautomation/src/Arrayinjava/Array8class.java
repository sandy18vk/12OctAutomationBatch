package Arrayinjava;

public class Array8class {
	
	public static void main(String[] args) {
		
		Object array[]= {12,"String"}; // for interviw purpose
		
		int array2[][]= {{1,2,4}, {5,7,8} , {15,47,58} };
		
		array2[1][2]= 90;
		
		
		
		for(int i=0; i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				System.out.print(array2[i][j]+" ");
			}
			System.out.println(); // change line
			
		}	
		
		System.out.println("*************");
		
		for(int[] row: array2 ) {
		
			for(int a:row) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
		
	}
 
}
