/*
 * Author: Ravi Rizaei
 * Date: 7/26/2024
 *
 * Description:
 * This program demonstrates how to swap two variables in Java.
 * It includes examples of swapping using a temporary variable,
 * and swapping without using a temporary variable (using arithmetic operations).
 * The goal is to help understand the concept of swapping values between variables.
 */

public class Main {
    public static void main(String[] args) {
        // What is swapping in Java?
        // Swapping is the process of exchanging the values of two variables.

        // How do you swap variables using a temporary variable?
        // Example: Swapping two integer variables using a temporary variable

        // Declare and initialize two variables
        int x = 5; // variable x is initialized with 5
        int y = 10; // variable y is initialized with 10

        // Display initial values
        System.out.println("Before Swapping:");
        System.out.println("x = " + x); // Displays the initial value of x
        System.out.println("y = " + y); // Displays the initial value of y

        // Swapping using a temporary variable
        int temp = x; // temporary variable to hold the value of x
        x = y; // x takes the value of y
        y = temp; // y takes the value of temp (initial value of x)

        // Display values after swapping
        System.out.println("\nAfter Swapping using a temporary variable:");
        System.out.println("x = " + x); // Displays the value of x after swapping
        System.out.println("y = " + y); // Displays the value of y after swapping

        // How do you swap variables without using a temporary variable?
        // Example: Swapping variables using arithmetic operations

        // Swapping back to original using arithmetic
        x = x + y; // x now holds the sum of both variables
        y = x - y; // y now holds the original value of x
        x = x - y; // x now holds the original value of y

        // Display values after swapping using arithmetic
        System.out.println("\nAfter Swapping without a temporary variable:");
        System.out.println("x = " + x); // Displays the value of x after swapping back
        System.out.println("y = " + y); // Displays the value of y after swapping back
    }
}
