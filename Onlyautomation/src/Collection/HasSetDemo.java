package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HasSetDemo {
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();  // default hasset capacity 16 load factor is 0.75
		
//		HashSet hs1 = new HashSet(100); // initial capacity 100
//		HashSet<Integer> hs7 = new HashSet<Integer>();
//		HashSet hs2 = new HashSet(100, (float)0.90);
//		
		
		// add object / elements into Hasset
		
		hs.add(100);
		hs.add("Welcome");
		hs.add(16.5);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs); // insertion order not followed
	
		//remove
	hs.remove(16.5);
	System.out.println(hs);
	
	//contains 
	System.out.println(hs.contains("Welcome"));
	
	System.out.println(hs.contains("xyz"));
	
	System.out.println(hs.isEmpty());
	
	// reading object /elements from hasset using for... each loop
	
	for(Object d:hs) {
		System.out.println(d);
	}
	
	// iterator
	Iterator it = hs.iterator();
	
	while(it.hasNext()) {
		
	System.out.println(it.next());	
	}
	
	}

}
