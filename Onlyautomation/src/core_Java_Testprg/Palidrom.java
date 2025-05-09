package core_Java_Testprg;

import java.util.Scanner;

public class Palidrom {
	
	public static void main(String[] args) {
		
		Scanner de = new Scanner(System.in);
		System.out.println("enter the number");

		int num = de.nextInt();
		
		int org_num=num;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
         if(org_num==rev)
         {
        	 System.out.println("The number is palidrom");
         }else {
        	 System.out.println("The number is not palidrom");
         }
	}

	
	
}
