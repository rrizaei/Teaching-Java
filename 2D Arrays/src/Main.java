/*
 * Author: Ravi Rizaei
 * Date: 8/12/2024
 *
 * Description:
 * This program demonstrates the use of 2D arrays in Java.
 * It explains what 2D arrays are, how to create and initialize them,
 * and provides examples of accessing, modifying, and iterating through 2D arrays.
 */

public class Main {
    public static void main(String[] args) {
        // What is a 2D array in Java?
        // A 2D array is an array of arrays, effectively creating a grid-like structure.
        // It can be thought of as a table with rows and columns, where each element is accessed using two indices.

        // How do you declare and initialize a 2D array?
        // Example: Declaring and initializing a 2D array of integers
        int[][] matrix = {
                {1, 2, 3},  // First row
                {4, 5, 6},  // Second row
                {7, 8, 9}   // Third row
        };

        // Accessing and printing elements of a 2D array
        System.out.println("2D Array Elements:");
        for (int i = 0; i < matrix.length; i++) { // Outer loop for rows
            for (int j = 0; j < matrix[i].length; j++) { // Inner loop for columns
                System.out.print(matrix[i][j] + " "); // Access element at row i, column j
            }
            System.out.println(); // Moves to the next line after printing each row
        }

        // Explanation:
        // 1. The 2D array 'matrix' has 3 rows and 3 columns.
        // 2. Elements are accessed using two indices: matrix[row][column].
        // 3. The outer loop iterates through each row, while the inner loop iterates through each column of that row.

        // How do you modify elements in a 2D array?
        // Example: Modifying an element in the 2D array
        matrix[1][1] = 10; // Changes the element at row 1, column 1 to 10
        System.out.println("\nModified 2D Array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Example: Calculating the sum of all elements in a 2D array
        int sum = 0; // Variable to hold the sum
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j]; // Adds each element to the sum
            }
        }
        System.out.println("\nSum of all elements: " + sum); // Prints the sum of the elements

        // Key Points:
        // - 2D arrays are useful for representing tabular data, grids, and matrices.
        // - Elements are accessed using two indices, representing rows and columns.
        // - Nested loops are commonly used to iterate through 2D arrays.
    }
}
