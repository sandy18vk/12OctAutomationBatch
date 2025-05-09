package String;

public class reverseastring {

	public static void main(String[] args) {

		// Approach 1 -length () , charAt()

		String s = "welcome";  // 6 length  emoclew
		String rev = "";  

		for (int i = s.length() - 1; i >= 0; i--) {  //   ,6-1=5 5>=0 5-1=4   ininitalaisation condition print stat at the end inc or dec

			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		// approch 2 without using string method

		String s1 = "Selenium";
		String rev1 = "";

		char a[] = s1.toCharArray();

		for (int i = a.length - 1; i >= 0; i--) {

			rev1 = rev1 + a[i];

		}

		System.out.println(rev1);

//		// approach 3 using string buffer class
//
//		StringBuffer s9 = new StringBuffer("welcome");
//
//		System.out.println(s9.reverse());
//
//		// approach 4 string builder class
//
//		StringBuilder s2 = new StringBuilder("welcome");
//		System.out.println(s2.reverse());

	}

}
