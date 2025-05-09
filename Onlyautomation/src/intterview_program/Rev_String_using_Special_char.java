package intterview_program;

import java.util.Stack;

public class Rev_String_using_Special_char {

//		    public static void main(String[] args) {
//		        String input = "I am Automation Tester #@!&";
//		        System.out.println(reverseOnlyAlphanum(input));
//		    }
//
//		    public static String reverseOnlyAlphanum(String str) {
//		        char[] chars = str.toCharArray();
//		        int left = 0, right = chars.length - 1;
//
//		        while (left < right) {
//		            if (!Character.isLetterOrDigit(chars[left]) && !Character.isWhitespace(chars[left])) {
//		                left++;
//		            } else if (!Character.isLetterOrDigit(chars[right]) && !Character.isWhitespace(chars[right])) {
//		                right--;
//		            } else {
//		                char temp = chars[left];
//		                chars[left] = chars[right];
//		                chars[right] = temp;
//
//		                left++;
//		                right--;
//		            }
//		        }
//
//		        return new String(chars);
//		    }
	public static void main(String[] args) {
		
		String input = " I am Automation Tester #@!&";
		char [] ch= input.toCharArray();
		Stack<Character> stack =new Stack<>(); // obj of stack
		
		for(char c: ch) {
			if(Character.isLetter(c)||c==' ') {
				stack.push(c); // add the character
			}
		}
		
		StringBuilder result= new StringBuilder();
		for(char c: ch) {
			if(Character.isLetter(c)||c==' ') {
				result.append(stack.pop()); // drop out // top - delect 
			}else {
				result.append(c); // adding rever string char 
			}
		
	}
		System.out.println(result);
	
		}
}