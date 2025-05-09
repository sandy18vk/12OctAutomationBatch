package polymorphism;

public class Overloadmainm {
	
	void main() {
		System.out.println(3);
	}
	void main(String s) {
		System.out.println(s);
	}
	
	void main(String  d,String g) {
		System.out.println(d+g);
	}
	
	void main(char b) {
		System.out.println(b);
	}
	
public static void main(String[] args) {
	Overloadmainm jn=new Overloadmainm();
	jn.main();
	jn.main('g');
	jn.main("Sandeep");
	jn.main("car"+" "+ "pen");
}
}
