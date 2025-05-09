package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInJava {

	public static void main(String[] args) {
		
		Set HashSet =new HashSet();
		
		HashSet.add("A");
		HashSet.add(null);
		HashSet.add("Z");
		HashSet.add(100);
		HashSet.add("K");
		HashSet.add("C");
		HashSet.add(100);
		HashSet.add(null);
		
		System.out.println(HashSet);
		
		Set LinkedHashSet = new LinkedHashSet ();
		
		LinkedHashSet.add("A");
		LinkedHashSet.add(null);
		LinkedHashSet.add("Z");
		LinkedHashSet.add(100);
		LinkedHashSet.add("K");
		LinkedHashSet.add("C");
		LinkedHashSet.add(100);
		LinkedHashSet.add(null);
		
		System.out.println(LinkedHashSet);
		
		Set  TreeSet = new TreeSet ();
		
	//	System.out.println(TreeSet.add("a"));
		//TreeSet.add("A");
		//TreeSet.add(null);
		//TreeSet.add("Z");
		TreeSet.add(100);
	//	TreeSet.add("K");
	//	TreeSet.add("C");
	//	System.out.println(TreeSet.add("a"));
		TreeSet.add(100);
		//TreeSet.add(null);
		System.out.println(TreeSet);
		
		
		

	}

}
