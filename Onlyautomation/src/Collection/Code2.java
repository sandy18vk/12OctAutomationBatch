package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Code2 {

	public static void main(String[] args) {
		// remove duplicate
//		int[] array = { 3, 1, 2, 3, 4, 2, 5, 3, 2, 1 };
//
//		Set set = new HashSet();
//
//		for (int i : array) {
//			set.add(i);
//
//		}
//		System.out.println(set);

//		List list = new ArrayList(); // size = 8
//
//		list.add(10);
//		list.add(10);
//		list.add(13);
//		list.add(14);
//		list.add(18);
//		list.add(100);
//		list.add(12);
//		list.add(17);

		List list1 = new ArrayList(); // size = 7

		list1.add(100);
		list1.add(66);
		list1.add(56);
		list1.add(14);
		list1.add(18);
		list1.add(100);
		list1.add(12);
		list1.add(17);

		System.out.println(list1);
		
//		Collections.sort(list);
//		System.out.println(list);
//		
//		Collections.reverse(list);
//		System.out.println(list);
//
//		// size should be same
//		Collections.copy(list1, list);
//		System.out.println(list1);
//
//		int max = (int) Collections.max(list1);
//		System.out.println(max);
//
//		int min = (int) Collections.min(list1);
//		System.out.println(min);

		int frequency = Collections.frequency(list1, 100);
		System.out.println(frequency);
		
//		System.out.println(list);
//		Collections.replaceAll(list, 10, 7777);
//		System.out.println(list);
//		
//		Collections.shuffle(list1);
//		System.out.println(list1);
//		
		
//		list1=(List) Collections.unmodifiableCollection(list);
//		list1.add(45);
//		System.out.println(list);

		
		
	}

}
