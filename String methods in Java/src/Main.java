/*
 * Author: Ravi Rizaei
 * Date: 8/13/2024
 *
 * Description:
 * This program demonstrates various String methods in Java.
 * It explains how to use common String methods such as length(), toUpperCase(),
 * toLowerCase(), substring(), indexOf(), charAt(), replace(), and trim().
 * The program shows examples of each method to manipulate and analyze strings.
 */

public class Main {
    public static void main(String[] args) {
        // What is a String in Java?
        // A String is a sequence of characters used to represent text. 
        // Java provides many built-in methods to manipulate and analyze strings.

        // Example String
        String message = "  Hello, Java World!  ";

        // 1. length() - Returns the length of the string
        System.out.println("Length of the string: " + message.length()); // Prints the length of the string

        // 2. toUpperCase() - Converts all characters in the string to uppercase
        System.out.println("Uppercase: " + message.toUpperCase()); // Converts the string to uppercase

        // 3. toLowerCase() - Converts all characters in the string to lowercase
        System.out.println("Lowercase: " + message.toLowerCase()); // Converts the string to lowercase

        // 4. trim() - Removes leading and trailing spaces from the string
        System.out.println("Trimmed: '" + message.trim() + "'"); // Removes spaces around the string

        // 5. substring() - Extracts a portion of the string
        System.out.println("Substring (7, 11): " + message.substring(7, 11)); // Extracts characters from index 7 to 10

        // 6. indexOf() - Returns the index of the first occurrence of a specified character or substring
        System.out.println("Index of 'Java': " + message.indexOf("Java")); // Finds the starting index of "Java"

        // 7. charAt() - Returns the character at a specific index
        System.out.println("Character at index 8: " + message.charAt(8)); // Prints the character at index 8

        // 8. replace() - Replaces occurrences of a character or substring with another
        System.out.println("Replace 'Java' with 'World': " + message.replace("Java", "World")); // Replaces "Java" with "World"

        // Explanation:
        // 1. The String methods provide powerful tools to analyze and modify strings.
        // 2. Methods like length(), toUpperCase(), and substring() help manipulate string content easily.
        // 3. Each method has specific use cases, enhancing text processing in Java.

        // Key Points:
        // - Strings are immutable, meaning once created, their values cannot be changed.
        // - String methods return new strings or information about the string, without altering the original string.
        // - Methods like trim() and replace() are useful for cleaning and modifying text data.
    }
}
