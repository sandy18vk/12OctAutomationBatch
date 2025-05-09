package String;

public class Stringclassinjava {

	public static void main(String[] args) {

		String s1 = "velocity"; // constant pool area

		String s9 = "velocity";

		String s2 = "velocity";

		String s3 = "Test";

		String s4 = new String("Velocity"); // String non-constant pool area

		String s5 = new String("Velocity"); // String non-constant pool area

		String s10 = " ";

		String s11 = "velocity";

		int a = 10;
		int b = 20;

		// Diff bet "==" & .equals() method

		System.out.println(s1 == s2); // memory location same or not
		System.out.println(s1 == s4); // false
		System.out.println(s1.equals(s4));
		System.out.println(s1.charAt(5)); // return char
		System.out.println(s1.substring(3));
		System.out.println(s1.compareTo(s3));
		
		char ch = s1.charAt(2);
	System.out.println(s1.concat(s3));
		
		System.out.println(s3.concat(s1));
		System.out.println(s3);

		System.out.println(s1.indexOf("y"));
		System.out.println(s1.lastIndexOf('t'));


		
		System.out.println(s1.endsWith("city"));
		
		System.out.println(s1.startsWith(s2));
		

		System.out.println(s1.equals(s9));
		System.out.println(s1.equalsIgnoreCase(s9));
		
		System.out.println(s10.isBlank());
		System.out.println(s10.isEmpty());

		String str = "velocity class this is";
		char ch1[] = str.toCharArray();
		
		for (char c : ch1) {
			System.out.println(c);
		}

		String str1 = "  iam velocity class   this is  ";

		String str11[] = str1.split(""); // aaray format
	

		System.out.println(str11.length);
	

		for (String s : str11) {
			System.out.println(s);
		}

		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.toUpperCase());

		String str111 = "  Hello   World  ";

		// Using replace()
		String result = str111.replace("l", "p"); // Removes all spaces
		
		System.out.println("After removing all spaces: " + result);

		 System.out.println(str1.trim());
	
		System.out.println(str1);

		System.out.println(str1.contains("velocity"));

	}

}
