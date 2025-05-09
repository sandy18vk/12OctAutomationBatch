package String;

public class Countcharoccurance {

	public static void main(String[] args) {
	
		
		String s="java programming java oops selenium all type java";
		
		int totalcount=s.length();
		
		System.out.println(s.length());// total length
		
		
		
		
        int totalcountafter_remove=s.replace("p", "").length();
		
		int count=totalcount-totalcountafter_remove;
		
		System.out.println(count);

	}

}
