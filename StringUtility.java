/**
 * StringUtility - A simple Java utility tool for string manipulation
 * SWE-442 Project: Version Control and Release Management
 */
public class StringUtility {

    /**
     * Reverses a given string
     * @param str the string to reverse
     * @return the reversed string
     */
    public static String reverse(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * Counts the number of vowels in a string
     * @param str the string to analyze
     * @return the number of vowels
     */
    public static int countVowels(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    /**
     * Main method to demonstrate the utility functions
     */
    public static void main(String[] args) {
        // Test reverse function
        String testString = "Hello World";
        System.out.println("Original: " + testString);
        System.out.println("Reversed: " + reverse(testString));

        // Test countVowels function
        System.out.println("\nVowel count in '" + testString + "': " + countVowels(testString));
    }
}
