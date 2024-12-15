/*
 * Author: Ravi Rizaei
 * Date: 7/27/2024
 *
 * Description:
 * This program demonstrates how to accept user input in Java.
 * It includes examples of using the Scanner class to read different types of input,
 * such as integers, doubles, characters, and strings.
 * The goal is to help understand how to interact with the user through console input.
 */

import java.util.Scanner; // Import the Scanner class for user input

public class Main {
    public static void main(String[] args) {
        // What is Scanner in Java?
        // Scanner is a class in Java that is used to read input from various input sources like keyboard.

        // How do you set up Scanner to read input?
        // Setting up Scanner to read input from the user
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        // How to accept different types of user input?
        // Example: Accepting an integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read an integer input from the user

        // Example: Accepting a double input
        System.out.print("Enter the price of an item: ");
        double price = scanner.nextDouble(); // Read a double input from the user

        // Example: Accepting a single character input
        System.out.print("Enter your grade: ");
        char grade = scanner.next().charAt(0); // Read a single character input from the user

        // Example: Accepting a string input
        System.out.print("Enter your name: ");
        scanner.nextLine(); // Clear the buffer before reading the next line
        String name = scanner.nextLine(); // Read a full line of string input from the user

        // Displaying the collected inputs
        System.out.println("\nCollected Inputs:");
        System.out.println("Name: " + name); // Display the entered name
        System.out.println("Age: " + age); // Display the entered age
        System.out.println("Price: $" + price); // Display the entered price
        System.out.println("Grade: " + grade); // Display the entered grade

        // Close the scanner to prevent resource leaks
        scanner.close(); // Good practice to close the scanner when done
    }
}
