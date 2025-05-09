package intterview_program_Array;

public class RotateArraytotheRightbyKSteps {
	public static void main(String[] args) {
		
	
	int arr[] = { 8,6,7,8,9,6,5};
	
	int k = 1;
	
	int n=arr.length;
	
	int [] result = new int [n];
	
	for(int i=0; i<n;i++) {
		int newindex =(i+k)%n;
		result[newindex]=arr[i]; //i+k%n
	}
	for(int num:result) {
	System.out.println(num);
	}
	
	}
}
