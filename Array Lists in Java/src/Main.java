/*
 * Author: Ravi Rizaei
 * Date: 8/18/2024
 *
 * Description:
 * This program demonstrates the use of ArrayList in Java.
 * It explains what ArrayLists are, how to create and manipulate them, and why they are used
 * instead of traditional arrays. The program provides examples of adding, removing, accessing,
 * and iterating through elements in an ArrayList.
 */

import java.util.ArrayList; // Importing ArrayList from java.util package

public class Main {
    public static void main(String[] args) {
        // What is an ArrayList in Java?
        // An ArrayList is a resizable array-like data structure provided by Java's Collections Framework.
        // Unlike traditional arrays, ArrayLists can grow and shrink dynamically as elements are added or removed.

        // How do you create an ArrayList?
        // Example: Creating an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>(); // Creates an ArrayList that holds Integer objects

        // Adding elements to the ArrayList
        numbers.add(10); // Adds 10 to the ArrayList
        numbers.add(20); // Adds 20 to the ArrayList
        numbers.add(30); // Adds 30 to the ArrayList
        System.out.println("ArrayList after adding elements: " + numbers); // Prints the ArrayList

        // Accessing elements in an ArrayList
        int firstElement = numbers.get(0); // Accesses the first element (index 0)
        System.out.println("First element: " + firstElement);

        // Modifying elements in an ArrayList
        numbers.set(1, 25); // Changes the element at index 1 to 25
        System.out.println("ArrayList after modification: " + numbers);

        // Removing elements from an ArrayList
        numbers.remove(2); // Removes the element at index 2
        System.out.println("ArrayList after removing element: " + numbers);

        // Iterating through an ArrayList using a for loop
        System.out.println("Iterating through the ArrayList:");
        for (int i = 0; i < numbers.size(); i++) { // size() returns the number of elements in the ArrayList
            System.out.println("Element at index " + i + ": " + numbers.get(i));
        }

        // Using an enhanced for loop to iterate through an ArrayList
        System.out.println("Using enhanced for loop:");
        for (Integer number : numbers) {
            System.out.println("Element: " + number);
        }

        // Explanation:
        // 1. ArrayLists are dynamic arrays that can grow and shrink in size.
        // 2. Methods like add(), remove(), get(), and set() make ArrayLists flexible and easy to manipulate.
        // 3. ArrayLists can only hold objects, so primitives are automatically boxed into their wrapper classes (e.g., int -> Integer).

        // Key Points:
        // - ArrayLists are part of Java's Collections Framework and are used for storing and managing dynamic data.
        // - They allow random access to elements and provide various methods to manipulate the list efficiently.
        // - ArrayLists can only store objects, not primitive types directly, hence the use of wrapper classes.
    }
}
