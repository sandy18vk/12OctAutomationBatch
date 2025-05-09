package array_Practice_prog;

import java.util.Arrays;

public class Second_Largest_Element {
	
	 // function to find the second largest element
	static int SecondLargest(int[] array) {
        int n = array.length;
        //n=5
        // Sort the array in non-decreasing order
        Arrays.sort(array);
        
        // start from second last element as last element is the largest
        for (int i = n - 2; i >= 0; i--) {
       	
            // return the first element which is not equal to the 
            // largest element
            if (array[i] != array[n - 1]) {
                return array[i];
            }
        }
        
        // If no second largest element was found, return -1
        return (Integer) null;
    }

    public static void main(String[] args) {
        int[] array = { 12, 35, 1, 10, 34, 1 };
        System.out.println(SecondLargest(array));
    }
}

