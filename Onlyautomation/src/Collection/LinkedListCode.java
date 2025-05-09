package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCode {

	public static void main(String[] args) {
//		List<Integer>ar1 =new ArrayList<Integer>();
//		List<Integer>ar2 =new ArrayList<Integer>();
//		
//		
//		List<Integer>ar3 =new LinkedList<Integer>();
//		LinkedList<Integer> ar4= new LinkedList<Integer>();
		
	LinkedList ar4=new LinkedList();
		
		
		ar4.add(900);
		ar4.add(200);
		ar4.add(300);
		ar4.add(400);
		ar4.add(500);
		ar4.add("sandeep");
		
		System.out.println(ar4.element());
		System.out.println(ar4);
		ar4.offer(null);
		System.out.println(ar4);
		ar4.offer(70000);
		System.out.println(ar4);
		ar4.offerFirst(7676767);
		System.out.println(ar4);
		ar4.offerLast(4232332);
		System.out.println(ar4);
		
		ar4.poll(); //remove first
		System.out.println(ar4);
		
		ar4.pollFirst();
		System.out.println(ar4);
		ar4.pollLast();
		System.out.println(ar4);
		ar4.push(78988);
		System.out.println(ar4);
		ar4.pop();
		System.out.println(ar4);
		
		System.out.println(ar4.size());
		
	    ar4.remove(2);
	    System.out.println(ar4);
	    
	    // insert/adding/element in the middle of link list
	   ar4.add(1, 67);
	   System.out.println(ar4);
	   
	   ar4.add(3, "java");
	   System.out.println(ar4);
	   
	   //retriving the value
	  
	   System.out.println(ar4.get(2));
		
	   // change the value 
	   
	   ar4.set(3, "dopa");
	   System.out.println(ar4);
	   
	   // contains 
	   
	   System.out.println(ar4.contains("dopa"));
	   		System.out.println(ar4.contains("marcos"));
	   
	   		//isEmpty
	   		System.out.println(ar4.isEmpty());
	   		
	   // reading obj from using for loop
	   		
	   		for(int i=0; i<ar4.size();i++) {
	   			System.out.println(ar4.get(i));
	   		}
	   		
	   	// 	for each loop
	   		for(Object g: ar4) {
	   			System.out.println(g);
	   		}
	   		
	   		// Iterator () method 
	   		
	   		Iterator it=ar4.iterator();
	   		while(it.hasNext())
	   		System.out.println(it.next());
	   		
	}

}
