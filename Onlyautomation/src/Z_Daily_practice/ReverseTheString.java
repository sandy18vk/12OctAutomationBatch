package Z_Daily_practice;

public class ReverseTheString {

	public static void main(String[] args) {
	


		String s1 = "Sandeep";
		String rev1 = "";

		int totalcount=s1.length();
		char a[] = s1.toCharArray();

		for (int i = a.length - 1; i >= 0; i--) {

			rev1 = rev1 + a[i];

		}

		System.out.println(rev1);
		System.out.println(totalcount);
	}

}
