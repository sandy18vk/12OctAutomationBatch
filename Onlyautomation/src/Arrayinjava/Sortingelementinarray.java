package Arrayinjava;

import java.util.Arrays;

public class Sortingelementinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {100,600,200,500,400};
		
		System.out.println("before sorting.....");
		
		System.out.println(Arrays.toString(a));
		
//		/*for(int value:a) {
//			System.out.println(value);
//		}
		
		Arrays.sort(a); // sort element in array
		
        System.out.println("after sorting.....");
		
		System.out.println(Arrays.toString(a));
		

	}

}
