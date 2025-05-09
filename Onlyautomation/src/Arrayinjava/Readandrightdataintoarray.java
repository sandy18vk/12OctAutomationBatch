package Arrayinjava;

import java.util.Arrays;
import java.util.Scanner;

public class Readandrightdataintoarray {

	public static void main(String[] args) {
		
		
		int a[]=new int[6];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<a.length;i++) {
			
			System.out.println("enter the value"+" :");
			
			a[i]=sc.nextInt();
			System.out.println(Arrays.toString(a));
			
		}

	}

}
