package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection_Class_Method {

	public static void main(String[] args) {
		
	
		// input : { 3,1,2,3,4,2,5} = output={2 ,3}

		// Identify dublicate elements

		int[] array = { 3, 1, 2, 3, 4, 2, 5, 3, 2, 1 };

		List list = new ArrayList();
		Set set = new HashSet();

//		for (int i : array) {
//
//			if (set.add(i) == false) {
//				if (list.contains(i) == false) {
//					list.add(i);
//
//				}
//
//			}
//
//		}
		
		for (int i : array) {

			if ( ! set.add(i) && ! list.contains(i)) {
				
					list.add(i);
			}}

		System.out.println(list);

//		for(int i=0; i<array.length;i++) {
//			
//			for(int j=i+1 ; j<array.length;j++) {
//				if(array[i]==array[j]) {
//					
//					System.out.println(array[j]);
//					
//				}
//			}
//		}

	}

}
