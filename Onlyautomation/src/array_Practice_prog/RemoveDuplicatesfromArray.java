package array_Practice_prog;

public class RemoveDuplicatesfromArray {
	// Eliminate duplicate elements, leaving only unique values.
	public static void main(String[] args) {
		
		int a[]= {1, 2, 2, 3, 4, 4, 5,5,5,5,5,6,7,8,8,9,9,};
			
		int len=a.length;
		int temp[]= new int [a.length];
		int j=0;
		
		for(int i=0;i<len-1;i++) {
				 
			if(a[i]!=a[i+1]) {
				temp[j++]=a[i];
			}
		}
		
		temp[j++]=a[len-1];
		
		for(int k=0; k<j; k++) { // used for iterate the loop
			System.out.println(temp[k]);
		}
	}

}
