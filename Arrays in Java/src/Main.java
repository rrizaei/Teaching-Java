/*
 * Author: Ravi Rizaei
 * Date: 8/11/2024
 *
 * Description:
 * This program demonstrates the use of arrays in Java.
 * It explains what arrays are, how to create and initialize them,
 * and provides examples of accessing, modifying, and iterating through arrays.
 */

public class Main {
    public static void main(String[] args) {
        // What is an array in Java?
        // An array is a collection of elements of the same data type, stored in a contiguous memory location.
        // Arrays allow you to store multiple values in a single variable, making data management easier.

        // How do you declare and initialize an array?
        // Example: Declaring and initializing an array of integers
        int[] numbers = {10, 20, 30, 40, 50}; // Declares an array and initializes it with values

        // Accessing and printing array elements
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) { // Loop through the array using its length
            System.out.println("Element at index " + i + ": " + numbers[i]); // Access each element by index
        }

        // Explanation:
        // 1. The array 'numbers' stores integers in a single variable.
        // 2. Arrays are zero-indexed, meaning the first element is at index 0.
        // 3. The loop runs from 0 to numbers.length - 1, accessing each element by index.

        // How do you modify array elements?
        // Example: Modifying an element in the array
        numbers[2] = 35; // Changes the element at index 2 (third element) to 35
        System.out.println("\nModified element at index 2: " + numbers[2]); // Prints the updated element

        // Example: Using arrays in calculations
        int sum = 0; // Variable to hold the sum of the array elements
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // Adds each element of the array to the sum
        }
        System.out.println("\nSum of array elements: " + sum); // Prints the sum of the elements

        // Explanation:
        // 1. Arrays are flexible and can be used in calculations or to store and manipulate data.
        // 2. You can modify any element by accessing it with its index and assigning a new value.

        // Key Points:
        // - Arrays are useful for storing multiple values of the same type in one variable.
        // - They are zero-indexed, meaning the first element is accessed at index 0.
        // - Arrays can be accessed, modified, and used in various calculations and operations.
    }
}
