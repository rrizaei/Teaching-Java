/*
 * Author: Ravi Rizaei
 * Date: 8/8/2024
 *
 * Description:
 * This program demonstrates the use of while loops in Java.
 * It explains the basic structure of a while loop and provides examples
 * of how to use it to repeat a block of code while a condition is true.
 * The program allows the user to enter numbers until a certain condition is met.
 */

import java.util.Scanner; // Importing Scanner for user input

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read input

        // What is a while loop in Java?
        // A while loop repeatedly executes a block of code as long as a given condition is true.

        // How does a while loop work?
        // Structure of a while loop:
        // while (condition) {
        //     // Code to execute repeatedly while the condition is true
        // }

        // Example: Using a while loop to keep asking the user for input until they enter a negative number
        System.out.println("Enter positive numbers (enter a negative number to stop):");
        int number = scanner.nextInt(); // Read the first number from the user

        // Using a while loop to repeat the input process
        while (number >= 0) { // The loop continues as long as the number is non-negative
            System.out.println("You entered: " + number); // Prints the number entered
            System.out.print("Enter another number: "); // Prompts for another input
            number = scanner.nextInt(); // Reads the next number
        }

        // Explanation:
        // 1. The loop starts by checking the condition (number >= 0).
        // 2. If the condition is true, it executes the code inside the loop.
        // 3. After executing, it checks the condition again. If true, it repeats the process.
        // 4. The loop stops when the condition becomes false (user enters a negative number).

        // Another example: Counting down from 10 to 1 using a while loop
        int countdown = 10; // Starting value

        System.out.println("\nCountdown:");
        while (countdown > 0) { // The loop continues while countdown is greater than 0
            System.out.println(countdown); // Prints the current value of countdown
            countdown--; // Decreases the value of countdown by 1
        }
        System.out.println("Liftoff!"); // Prints after the loop ends

        scanner.close(); // Closing the scanner
    }
}
