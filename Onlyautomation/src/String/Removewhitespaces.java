package String;

public class Removewhitespaces {

	public static void main(String[] args) {

		String s = "java  programming selenium   automation";

		System.out.println(s);

		s = s.replaceAll("\\s", "");

		System.out.println(s);
	}
}
