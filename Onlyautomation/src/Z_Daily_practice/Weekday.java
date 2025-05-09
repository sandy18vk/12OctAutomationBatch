package Z_Daily_practice;

import java.util.Scanner;

public class Weekday {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter the week days");
//
//		String days = sc.next();
//
//		switch (days) {
//
//		case "monday":
//			System.out.println("The day is monday");
//			break;
//		case "tuesday":
//			System.out.println("The day is tuesday");
//			break;
//
//		case "wed":
//			System.out.println("The day is wed");
//			break;
//
//		case "Thu":
//			System.out.println("The day is thu");
//			break;
//
//		case "friday":
//			System.out.println("The day is friday");
//			break;
//		case "saturday":
//			System.out.println("The day is saturday");
//			break;
//
//		case "sunday":
//			System.out.println("The day is sunday");
//			break;
//		default:
//			System.out.println("no days");

//		}
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the days :" );
		
		String days = sc.next();
		
		switch(days) {
		
		case "monday":
			System.out.println("This is your monday");
			break;
		case "Tue":
			System.out.println("This is your Tue");
			break;
		case "wed":
			System.out.println("This is your wed");
			break;
		case "Thus":
			System.out.println("This is your Thus");
			break;
		case "friday":
			System.out.println("This is your friday");
			break;
		case "sat":
			System.out.println("This is your sat");
			break;
		case "sunday":
			System.out.println("This is your sunday");
			break;
			default :
				System.out.println("There is no day");
		
		}
		
		
		
		
		
		
		

	}

}
