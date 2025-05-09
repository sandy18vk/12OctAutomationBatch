package polymorphism;

public class methodoverloading {
	
	void ticketbooking() {
		System.out.println("ticket booking from zero arguments");
		System.out.println(1000000000);
	}
	
	void ticketbooking(int a) {
		System.out.println("ticket booking from int arguments");
		System.out.println(a);
	}
	
	void ticketbooking(char b ,String g) {
		System.out.println("ticket booking from char arguments");
		System.out.println(b+g);
	}
	
	void ticketbooking(float c) {
		System.out.println("ticket booking from float arguments");
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		methodoverloading sg=new methodoverloading();
		sg.ticketbooking();
		sg.ticketbooking('j',  "  oops");
		sg.ticketbooking(45.78f);
	    sg.ticketbooking(56);
	}
}
