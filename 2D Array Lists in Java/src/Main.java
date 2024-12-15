/*
 * Author: Ravi Rizaei
 * Date: 8/19/2024
 *
 * Description:
 * This program demonstrates the use of 2D ArrayLists in Java.
 * It explains what 2D ArrayLists are, how to create and manipulate them,
 * and provides examples of adding, accessing, and iterating through a 2D ArrayList.
 */

import java.util.ArrayList; // Importing ArrayList from java.util package

public class Main {
    public static void main(String[] args) {
        // What is a 2D ArrayList in Java?
        // A 2D ArrayList is an ArrayList of ArrayLists, creating a dynamic, resizable table-like structure.
        // It allows you to store elements in rows and columns, much like a 2D array, but with dynamic sizing.

        // How do you create a 2D ArrayList?
        // Example: Creating a 2D ArrayList to store integers
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>(); // Creates a 2D ArrayList

        // Adding rows to the 2D ArrayList
        ArrayList<Integer> row1 = new ArrayList<>(); // Creating the first row
        row1.add(1); // Adding elements to the first row
        row1.add(2);
        row1.add(3);
        matrix.add(row1); // Adding the first row to the 2D ArrayList

        ArrayList<Integer> row2 = new ArrayList<>(); // Creating the second row
        row2.add(4);
        row2.add(5);
        row2.add(6);
        matrix.add(row2); // Adding the second row to the 2D ArrayList

        ArrayList<Integer> row3 = new ArrayList<>(); // Creating the third row
        row3.add(7);
        row3.add(8);
        row3.add(9);
        matrix.add(row3); // Adding the third row to the 2D ArrayList

        // Displaying the 2D ArrayList
        System.out.println("2D ArrayList Elements:");
        for (int i = 0; i < matrix.size(); i++) { // Outer loop for rows
            for (int j = 0; j < matrix.get(i).size(); j++) { // Inner loop for columns
                System.out.print(matrix.get(i).get(j) + " "); // Accessing elements by row and column
            }
            System.out.println(); // Moves to the next line after each row
        }

        // Explanation:
        // 1. The 2D ArrayList 'matrix' is a list of lists, creating a dynamic table.
        // 2. Elements are accessed using two indices: matrix.get(row).get(column).
        // 3. You can add, modify, and remove rows and columns dynamically.

        // Modifying an element in the 2D ArrayList
        matrix.get(1).set(1, 10); // Changes the element at row 1, column 1 to 10
        System.out.println("\nModified 2D ArrayList:");
        for (ArrayList<Integer> row : matrix) { // Enhanced for loop to iterate through rows
            for (Integer element : row) { // Enhanced for loop to iterate through elements in each row
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Key Points:
        // - 2D ArrayLists are flexible, allowing dynamic resizing of both rows and columns.
        // - They are useful for representing grids, tables, and other multi-dimensional data structures.
        // - Nested ArrayLists provide a powerful tool for managing complex data in a dynamic way.
    }
}
