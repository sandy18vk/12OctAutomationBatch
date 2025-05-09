package Z_Daily_practice;

public class Objectofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object s[] = { "string", 'f', 5,true,57.98 };

		for (Object x : s) {
			System.out.println(x);
		}
		
		for(int i=0;i<=s.length-1;i++) {
			System.out.println(s[i]);
		}

	}

}
