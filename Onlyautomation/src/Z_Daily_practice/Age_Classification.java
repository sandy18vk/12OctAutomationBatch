package Z_Daily_practice;

import java.util.Scanner;

public class Age_Classification {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Age classification");
		int Age = sc.nextInt();

		if (Age <= 13) {
			System.out.println("Child");
		} else if (Age >= 13 && Age <= 19) {
            System.out.println("Adult");
		} else if (Age >= 20 && Age <=64) {
			System.out.println("Teenager");

		} else if (Age >= 65) {
			System.out.println("Senior Citizen");
		} else {
			System.out.println("No More");
		}

	}

}
