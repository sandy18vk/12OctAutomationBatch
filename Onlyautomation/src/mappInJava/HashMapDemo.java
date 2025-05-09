package mappInJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		// HashMap m = new HashMap();

		HashMap<Integer, String> s = new HashMap<Integer, String>();

		s.put(101, "John"); // value , key
		s.put(102, "David");
		s.put(103, "John");
		s.put(104, "mary");
		s.put(105, "X");
		s.put(106, "John");

		System.out.println(s);

		System.out.println(s.get(104));

		s.remove(103);
		System.out.println(s);

		System.out.println(s.containsKey(101)); // key
		System.out.println(s.containsValue("John")); // values

		System.out.println(s.isEmpty());

		System.out.println(s.keySet()); // keys
		System.out.println(s.values()); // values

		for (Object y : s.keySet()) {
			System.out.println(y);
		}

		// System.out.println(m.values()); // values

		for (Object z : s.values()) {
			System.out.println(z);
		}

		for (Object d : s.keySet()) {
			System.out.println(d + " " + s.get(d)); // key + value

		}

		// entry method
		System.out.println(s.entrySet());

		for (Map.Entry entry : s.entrySet()) {

			System.out.println(entry.getKey() + "   " + entry.getValue());
		}

//		// iterator ()
//
//		Set s = m.entrySet();
//
//		Iterator it = s.iterator();
//
//		while (it.hasNext()) {
//
//			Map.Entry entry1 = (Entry) it.next();
//			System.out.println(entry1.getKey() + "  " + entry1.getValue());
//
//		}

	}

}
