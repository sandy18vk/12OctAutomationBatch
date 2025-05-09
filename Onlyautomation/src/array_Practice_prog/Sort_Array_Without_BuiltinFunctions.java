package array_Practice_prog;

public class Sort_Array_Without_BuiltinFunctions {
	public static void main(String[] args) {

		
		int a[] = { 5, 3, 8, 4, 2 };

//		Arrays.sort(array1);
//		for(int d: array1) {
//			System.out.println(d);
//		}
//		
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}













//		size=array1.length;
//		for(int i=0; i<size;i++) {
//			
//			for(int j=i+1; j<size; j++) {
//				
//				if(array1[i]>array1[j]) {
//					//5>3 ,  5>8
//					temp=array1[i];
//					//5 , 
//					array1[i]=array1[j];
//					//3
//					array1[j]=temp;
//					//5
//					
//				}
//			}
//		}
//		
//		for(int i=0;i<array1.length;i++) {
//			
//			System.out.println("array sorted:"+array1[i]);
//		}
