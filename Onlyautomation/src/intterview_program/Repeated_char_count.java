package intterview_program;

import java.util.HashMap;
import java.util.Map;

public class Repeated_char_count {

	public static void main(String[] args) {

		String str = "programming";

		char[] ch = str.toCharArray();

		// map store values in key= unique, values= duplicates paire
		Map<Character, Integer> charcount = new HashMap<>();

		for (char c : ch) {

			if (charcount.containsKey(c)) { // if present then add one 1 conut
				charcount.put(c, charcount.get(c) + 1);

			} else { // not present then else block
				charcount.put(c, 1);
			}

		}

		for (char key : charcount.keySet()) {

			System.out.println(key  + " = " + charcount.get(key));

		}
	}
}
