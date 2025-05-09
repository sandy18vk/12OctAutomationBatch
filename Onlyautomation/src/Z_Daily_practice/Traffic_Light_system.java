package Z_Daily_practice;

import java.util.Scanner;

public class Traffic_Light_system {

	public static void main(String[] args) {

		Scanner de = new Scanner(System.in); // scanner class syntex
		System.out.println("Simulate a traffic light system");

		String colour = de.next();

//		String colour = "Red";
//		String colour1 = "Yellow";
//		String colour2 = "Green";

//		if (colour== "Red") {
//			System.out.println("Stop");
//		} else {
//			System.out.println("not stop on red signal");
//		}
//		if (colour == "Yellow") {
//			System.out.println("Caution");
//		} else {
//			System.out.println("not follow caution");
//		}
//		if (colour == "Green") {
//			System.out.println("Go and safe");
//		} else {
//			System.out.println("Invalid colour");
//		}

		// **********************************************************************************************

		// . equal methods using contitional statment
		if (colour.equals("Red")) {
			System.out.println("Stop");
		} else if (colour.equals("Yellow")) {
			System.out.println("Caution");
		} else if (colour.equals("Green")) {
			System.out.println("Go");
		} else {
			System.out.println("Invalid colour");
		}

	}
}
