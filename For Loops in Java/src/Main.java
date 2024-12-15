/*
 * Author: Ravi Rizaei
 * Date: 8/9/2024
 *
 * Description:
 * This program demonstrates the use of for loops in Java.
 * It explains the basic structure of a for loop and provides examples
 * of how to use it to repeat a block of code a specific number of times.
 * The program includes examples of counting up, counting down, and iterating over arrays.
 */

public class Main {
    public static void main(String[] args) {
        // What is a for loop in Java?
        // A for loop is used to repeat a block of code a specific number of times.
        // It is commonly used when you know in advance how many times you want to execute a block of code.

        // How does a for loop work?
        // Structure of a for loop:
        // for (initialization; condition; update) {
        //     // Code to execute repeatedly while the condition is true
        // }

        // Example 1: Counting up from 1 to 5 using a for loop
        System.out.println("Counting up:");
        for (int i = 1; i <= 5; i++) { // Starts at 1, loops while i <= 5, increments i by 1 each time
            System.out.println(i); // Prints the current value of i
        }

        // Explanation:
        // 1. Initialization: int i = 1 - Sets up the loop variable (starts at 1).
        // 2. Condition: i <= 5 - The loop runs while this condition is true.
        // 3. Update: i++ - Increments i by 1 after each loop iteration.

        // Example 2: Counting down from 5 to 1 using a for loop
        System.out.println("\nCounting down:");
        for (int i = 5; i > 0; i--) { // Starts at 5, loops while i > 0, decrements i by 1 each time
            System.out.println(i); // Prints the current value of i
        }

        // Example 3: Iterating over an array using a for loop
        int[] numbers = {10, 20, 30, 40, 50}; // An array of integers
        System.out.println("\nIterating over an array:");
        for (int i = 0; i < numbers.length; i++) { // Loops through each index of the array
            System.out.println("Element at index " + i + ": " + numbers[i]); // Prints each element
        }

        // Explanation of the array loop:
        // 1. Initialization: int i = 0 - Starts at the first index of the array.
        // 2. Condition: i < numbers.length - Loops while i is less than the length of the array.
        // 3. Update: i++ - Increments i to move to the next index.

        // Key points:
        // - The for loop is ideal when you know the number of iterations.
        // - It has three parts: initialization, condition, and update, controlling the loop's flow.
    }
}
