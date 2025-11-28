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
     * Converts a string to title case (first letter of each word capitalized)
     * @param str the string to convert
     * @return the string in title case
     */
    public static String toTitleCase(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalizeNext = true;
                result.append(c);
            } else if (capitalizeNext) {
                result.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                result.append(Character.toLowerCase(c));
            }
        }
        return result.toString();}
     * Checks if a string is a palindrome (reads the same forwards and backwards)
     * @param str the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        // Remove spaces and convert to lowercase for comparison
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
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

        // Test title case converter
        String mixedCase = "hello WORLD from JAVA";
        System.out.println("\nOriginal: " + mixedCase);
        System.out.println("Title Case: " + toTitleCase(mixedCase));
        // Test palindrome checker
        String palindrome1 = "racecar";
        String palindrome2 = "A man a plan a canal Panama";
        String notPalindrome = "Hello";
        System.out.println("\n'" + palindrome1 + "' is palindrome: " + isPalindrome(palindrome1));
        System.out.println("'" + palindrome2 + "' is palindrome: " + isPalindrome(palindrome2));
        System.out.println("'" + notPalindrome + "' is palindrome: " + isPalindrome(notPalindrome));
    }
}
