package Z_Daily_practice;

import java.util.Scanner;

public class Grade_Calculation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in) ;
	
			
		System.out.println("Input the score");

		int Score = sc.nextInt();
		
		if(Score>=90) {
		System.out.println("Print A");
		}else if(Score>=80 && Score<=89) {
			System.out.println("Print B");
		}else if(Score>=70 && Score<=79) {
			System.out.println("Print C");
		}else if(Score>=60 && Score<=69) {
			System.out.println("Print D");
		}else if(Score<60) {
			System.out.println("Print F");
		}else {
			System.out.println("You are failed B+");
		}

	}

}
