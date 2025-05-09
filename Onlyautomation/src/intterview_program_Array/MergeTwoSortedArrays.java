package intterview_program_Array;

import java.util.ArrayList;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
	//	int arr[]= {};

		ArrayList<Integer> list1= new ArrayList<Integer>();
		list1.add(1);
		list1.add(3);
		list1.add(5);
		
		ArrayList<Integer> list2= new ArrayList<Integer>();
		list2.add(2);
		list2.add(4);
		list2.add(6);
		
		ArrayList<Integer> result= new ArrayList<Integer>();
		
		for(int i=0;i<list1.size();i++) {
			result.add(list1.get(i));
			result.add(list2.get(i));
		}
		System.out.println(result);
	}

}
