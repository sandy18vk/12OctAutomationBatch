package Collection;

import java.util.HashSet;

public class HassetDemo3 {
	
	public static void main(String[] args) {
		
		// union , Intersection , difference
		
		
		HashSet<Integer> st=new HashSet<Integer>();
		
		st.add(1);
		st.add(2);
		st.add(3);
		st.add(4);
		st.add(5);
		
		System.out.println(st);
		
		HashSet<Integer> vt=new HashSet<Integer>();
		vt.add(3);
		vt.add(1);
		vt.add(3);
		vt.add(4);
		vt.add(5);
		
		System.out.println(vt);
		
		// union
		
		st.addAll(vt);
		System.out.println(st);
		
		// intersection
		st.retainAll(vt);
		System.out.println(st);
		
		// difference
		
		st.removeAll(vt);
		System.out.println(st);
		
		//subset
		st.containsAll(vt);
		System.out.println(st.containsAll(vt));
		System.out.println("subset of set :"+vt);
		
	}

}
