package array_Practice_prog;

public class PairSuminArrayusing_forloop {
	
	public static void main(String[] args) {
		//int a[]= {1, 5, 7, -1, 5};
		int a1[]= {3, 3, 4, 6,9,1};
		int sum =10;
		int n=a1.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j =i+1; j<n; j++) {
				
				if(a1[i]+a1[j]==sum) {
					System.out.println("sum of array elements:"+a1[i]+","+a1[j]);
	
				}
			}
			
		}
		
		
		
	}

}
