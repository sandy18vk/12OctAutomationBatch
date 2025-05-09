package array_Practice_prog;

public class PairSuminArray {

	public static void main(String[] args) {
		
		int a[]= {3, 3, 4,6,4,4,5,6,10,2};
		int sum=12;
		
		int low=0;
		int high=a.length-1;
		
		while(low<high) {
			if(a[low]+a[high]>sum) {
				high--;
				
			}else if(a[low]+a[high]<sum){
				low++;
			}else if(a[low]+a[high]==sum) {
				
				System.out.println("pair("+a[low]+","+a[high]+")");
				low++;
				high--;
			}
			
			
			
		}
		
		
		
		
		
		
	}
	
	
	
}
