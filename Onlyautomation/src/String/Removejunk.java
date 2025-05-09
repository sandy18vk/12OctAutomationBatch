package String;

public class Removejunk {

	public static void main(String[] args) {

		String s = "the java in to%%%&&*** selenium is easy to automation 98775665665";

		String s1 = "%$@() *Y&&  selenuim 89%^&*($ java";

		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);

	}

}
