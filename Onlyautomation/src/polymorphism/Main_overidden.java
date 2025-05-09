package polymorphism;

public class Main_overidden {
	
	public static void main(String[] args) {
		
		FlightBook_override h;
		h=new FlightBook_override();
		h.ticketbooking();
		h.ticketbooking2();
	    
		h=new Businessclass_override();
		h.ticketbooking();
		h.ticketbooking2();
		
		h=new Economyclass_override();
		h.ticketbooking();
		h.ticketbooking2();

	
	}
}
