package mappInJava;

import java.util.LinkedHashMap;
import java.util.Map;

public class Frequency_Count {

	// collection- frquency

//	public static void main(String[] args) {
//
//		String sr = "This is velocity traning centre";
//
//		Map<Character, Integer> count = new LinkedHashMap();
//
//		char ch[] = sr.toCharArray();
//
//		for (char d : ch) {
//
//			if (d != ' ') {
////				if (count.containsKey(d)) {
//
//					//count.put(d, count.get(d) + 1);
//					
//					count.put(d, count.getOrDefault(d, 0)+1);
//					
//				} 
////				else {
////					count.put(d, 1);
////				}
//
//			}
//
////	}

	public static void main(String[] args) {

		String sr1 = "This This is velocity  is    centre         traning This centre";

		Map<String, Integer> count = new LinkedHashMap();

		String tr2[] = sr1.split("\\s+"); // single or multiple spaces

		System.out.println(tr2.length);

		for (String word : tr2) {

			count.put(word, count.getOrDefault(word, 0) + 1);

		}

		System.out.println(count);

	}
}
