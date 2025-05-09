package String;

public class Vowels_count {
	
	public static void main(String[] args) {
        String str = "Komal Jadhav";
        int vowelCount = 0;

        // Convert the string to lowercase to handle both uppercase and lowercase vowels
        str = str.toLowerCase();

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++; // Increment the vowel count
                System.out.println("Vowel found: " + ch); // Display each vowel found
            }
        }

        // Display the total count of vowels
        System.out.println("Total number of vowels: " + vowelCount);
    }


}
