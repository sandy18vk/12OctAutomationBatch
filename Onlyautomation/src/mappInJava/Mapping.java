package mappInJava;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Mapping {
	
	public static void main(String[] args) {
		
		//Map<String , Integer> h=new HashMap();
		//Map<String , Integer> h=new Hashtable();
		//Map<String , Integer> h=new LinkedHashMap();
		Map<String , Integer> h=new TreeMap();
		
		System.out.println(h.isEmpty());
		
		// addition 
		
		h.put("Maths",100 );
		h.put("English",400 );
	//	h.put(null, 678);
		h.put("plan", null);
	//	h.put(null, 200);
		h.put("VI", null);
		h.put("VI", 234);
		
		System.out.println(h);
		
		// retrive 
		
		System.out.println(h.get("Maths"));
		System.out.println(h.values());
		
		//updates
		h.replace("Maths", 300);
		System.out.println(h);
		
		System.out.println(h.containsKey("Maths"));
		System.out.println(h.containsValue(300));
		System.out.println(h.size());
		
		System.out.println(h.putIfAbsent("sci", 9000)); // if add :> returns null
		System.out.println(h.get("Maths"));
		
		System.out.println(h.keySet());
		Set<String> set = h.keySet();
		
		System.out.println(h.values());
		
//		h.clear();
//		System.out.println(h.isEmpty())

		// entry interface and entry set method 

		for(Map.Entry<String, Integer>  entry : h.entrySet() ) {
			
			System.out.println("keys: "+entry.getKey()+"   Values :"+entry.getValue());
			
			
		}
		
	}

}
