package intterview_program_Array;

public class PairSuminArray {
  
	public static void main(String[] args) {
		
		int arr[]= {2, 7, 11, 15};
		int target =9;  // 2+7 = 9  , 
		int size=arr.length;
		
		for(int i=0 ; i<size-1;i++) { 
			
			for(int j=i+1;j<size-1;j++) {
				
				if(arr[i]+arr[j]==target) {
					
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	
}
}