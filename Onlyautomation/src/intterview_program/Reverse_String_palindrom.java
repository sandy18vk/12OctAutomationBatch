package intterview_program;

public class Reverse_String_palindrom {

	public static void main(String[] args) {

		String st = "selenium";

		String re = "";

		for (int i = st.length() - 1; i >= 0; i--) {

			re = re + st.charAt(i);

		}
		System.out.println(re);

		if (st.equals(re)) {
			System.out.println("String is palindrom!");
		} else
			System.out.println("String is not palindrom!");

	}

//	String str ="reverse";
//	char[] c=str.toCharArray();
//	StringBuffer sb=new StringBuffer();
//	for(int i=c.length-1;i>=0;i--) {
//		sb.append(c[i]);
//	}
//	System.out.println(sb.toString());
	
}
