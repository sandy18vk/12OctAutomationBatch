package String;

public class Stringvsbuffervsbuilder {

	public static void main(String[] args) {
		
		
		// string is immutable
		
		String s="welcome ";
		s.concat(" to java");
		System.out.println(s);
		
		
		//string buffer - mutable can change original value
		
		StringBuffer s1=new StringBuffer("welcome");
		s1.append("to java");
		System.out.println(s1);
		
		//StringBuilder -mutable
		
		StringBuilder s2=new StringBuilder("welcome");
		s2.append("to java");
		System.out.println(s2);

	}

}
