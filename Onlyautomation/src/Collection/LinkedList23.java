package Collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList23 {

	public static void main(String[] args) {

		{
			// Creating object of the
			// class linked list
			LinkedList ll = new LinkedList();

			// Adding elements to the linked list
			ll.add("A");
			ll.add("B");
			ll.add("x");
			ll.add("y");
			ll.add("Z");
//		        ll.addLast("C");
//		        ll.addFirst("D");
//	            ll.add(0, "z");

			LinkedList cvb = new LinkedList();

			cvb.addAll(ll);
			System.out.println(cvb);

			// System.out.println(ll);
//		        
//		        ll.add(ll);

			// System.out.println(cvb);

			cvb.removeAll(ll);
			System.out.println(cvb);

			// sort

			Collections.sort(ll);
			System.out.println(ll);
			
			Collections.sort(ll,Collections.reverseOrder());
			System.out.println(ll);
			
			
			Collections.shuffle(ll);
			System.out.println(ll);

//		        System.out.println(ll);
//
//		        ll.remove("B");
//		        ll.remove(3);
//		        ll.removeFirst();
//		        ll.removeLast();
//
//		        System.out.println(ll);
		}
	}

}
