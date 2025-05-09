package intterview_program;

public class Outputaabbbccccwiththeinputa2b3c4 {
	
	
	
	    public static void main(String[] args) {
	        String input = "a2b3c4";
	        StringBuilder output = new StringBuilder();
	        int size = input.length();

	        for (int i = 0; i < size; i += 2) {  
	            char ch = input.charAt(i);
	            int count = Character.getNumericValue(input.charAt(i + 1));

	            for (int j = 0; j < count; j++) {
	                output.append(ch);
	            }
	        }

	        System.out.println(output.toString());
	    }
	}


