/*
 * Author: Ravi Rizaei
 * Date: 8/17/2024
 *
 * Description:
 * This program demonstrates the use of wrapper classes in Java.
 * It explains what wrapper classes are, why they are used, and how they convert
 * primitive data types into objects. The program provides examples of using wrapper classes
 * for boxing, unboxing, and utilizing methods specific to each wrapper class.
 */

public class Main {
    public static void main(String[] args) {
        // What are wrapper classes in Java?
        // Wrapper classes are classes that provide a way to use primitive data types (int, double, char, etc.)
        // as objects. Each primitive type has a corresponding wrapper class (e.g., int -> Integer, double -> Double).

        // Why use wrapper classes?
        // Wrapper classes are useful when you need an object instead of a primitive, such as in collections
        // (e.g., ArrayList), for nullability, and to use utility methods provided by these classes.

        // Examples of wrapper classes:
        Integer age = 25;              // Wrapper class for int
        Double height = 5.9;           // Wrapper class for double
        Character initial = 'R';       // Wrapper class for char
        Boolean isStudent = true;      // Wrapper class for boolean

        // Demonstrating auto-boxing: Converting a primitive to a wrapper class object
        int primitiveInt = 10;
        Integer wrappedInt = primitiveInt; // Automatically wraps the primitive int into an Integer object
        System.out.println("Wrapped Integer: " + wrappedInt);

        // Demonstrating unboxing: Converting a wrapper class object back to a primitive
        Double wrappedDouble = 8.75;    // A Double object
        double primitiveDouble = wrappedDouble; // Automatically unwraps the Double to a primitive double
        System.out.println("Unboxed Double: " + primitiveDouble);

        // Using wrapper class methods
        System.out.println("Max Integer Value: " + Integer.MAX_VALUE); // Using a method from Integer class
        System.out.println("Parsed Integer: " + Integer.parseInt("123")); // Converts a String to an int
        System.out.println("Is letter a digit? " + Character.isDigit('5')); // Checks if the character is a digit
        System.out.println("Boolean from String: " + Boolean.parseBoolean("true")); // Converts a String to boolean

        // Explanation:
        // 1. Wrapper classes allow primitives to be used where objects are required.
        // 2. They provide methods to manipulate, convert, and inspect data.
        // 3. Boxing and unboxing simplify working with primitive and objects interchangeably.

        // Key Points:
        // - Wrapper classes include: Integer, Double, Character, Boolean, Byte, Short, Long, and Float.
        // - They enable primitives to be used in collections, provide utility methods, and handle null values.
        // - Auto-boxing and unboxing automatically convert between primitives and their corresponding objects.
    }
}
