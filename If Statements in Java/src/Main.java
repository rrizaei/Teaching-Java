/*
 * Author: Ravi Rizaei
 * Date: 8/5/2024
 *
 * Description:
 * This program demonstrates the use of if statements in Java.
 * It shows simple examples of if, if-else, and else-if statements
 * to help understand how to make decisions based on conditions.
 */

import java.util.Scanner; // Importing Scanner for user input

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read input

        // Basic if statement
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read a number from the user

        // Using an if statement
        if (number > 0) {
            System.out.println("The number is positive."); // Executes if the condition is true
        }

        // What is an if-else statement?
        // An if-else statement checks a condition. If the condition is true,
        // it executes the first block of code. Otherwise, it executes the second block.

        // Example of if-else statement: Checking if a number is positive or negative
        if (number >= 0) {
            // True Block: Executes when the condition (number >= 0) is true
            System.out.println("The number is positive.");
        } else {
            // False Block: Executes when the condition (number >= 0) is false
            System.out.println("The number is negative.");
        }

        // Explanation:
        // 1. Condition: (number >= 0) - Checks if the number is zero or positive.
        // 2. True Block: If the condition is true (number is zero or positive),
        //    the program executes the first block: "The number is positive."
        // 3. False Block: If the condition is false (number is negative),
        //    the program executes the second block: "The number is negative."

        // Else-if statement
        // Else-if statements are used to check multiple conditions in sequence.
        // Example: Checking if a number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close(); // Closing the scanner
    }
}
