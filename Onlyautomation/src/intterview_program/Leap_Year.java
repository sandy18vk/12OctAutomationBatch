package intterview_program;

public class Leap_Year {

	public static void main(String[] args) {
		
		int year =1900;
		
		if((year%4==0 && year%100!=0) || (year%400 ==0)) {
			 System.out.println(year + "This is leap year");
		}else {
			System.out.println(year +"This is not leap year");
		}
	}
	
}
