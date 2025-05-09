package intterview_program_Array;

public class SortArrayWithoutBuiltinFunctions {
	// bubble sorting 
	public static void main(String[] args) {
		
		int arr [] = {5, 3, 8, 4, 2};
		int size =arr.length;
		
		for(int i=0; i<=size-1;i++) {
			for(int j=i+1;j<size;j++) {
				
				if(arr[j]<arr[i]) {
					
					// swap arr[j] and arr[j+1]
					
					
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println("sorted arry: ");
		for(int num : arr) {
			System.out.println(num+"");
		}
	}

}
