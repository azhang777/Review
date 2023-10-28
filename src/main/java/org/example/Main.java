package org.example;
import java.util.*;

public class Main {
    //READ ME
    //Midterm review for the majority of the topics, loops or methods not included.
    //Topics are put into separate methods. In main, these methods can be called or commented out.
    //You can even cut and paste the methods into main to use them. Up to you!
    //This is a substitute / secondary review resource. Please review with better material that suits you!
    public static void arrayListExample() {
        // Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Fig");

        // Accessing elements by index
        System.out.println("Second fruit: " + fruits.get(1)); // Outputs: Second fruit: Banana

        // Iterating through the ArrayList using a for-each loop
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Removing an element by value
        fruits.remove("Date");

        // Check if an element exists
        boolean containsCherry = fruits.contains("Cherry");
        System.out.println("Contains Cherry: " + containsCherry); // Outputs: Contains Cherry: true

        // Getting the size of the ArrayList
        int size = fruits.size();
        System.out.println("Number of fruits: " + size); // Outputs: Number of fruits: 4

        // Clearing the ArrayList
        fruits.clear();
        System.out.println("Is the ArrayList empty? " + fruits.isEmpty()); // Outputs: Is the ArrayList empty? true

        // Adding elements in bulk using another collection (List)
        List<String> newFruits = new ArrayList<>();
        newFruits.add("Grapes");
        newFruits.add("Kiwi");
        newFruits.add("Mango");
        fruits.addAll(newFruits);

        // Iterating using an Iterator
        Iterator<String> iterator = fruits.iterator();
        System.out.println("All fruits with an iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Converting ArrayList to an array
        String[] fruitArray = fruits.toArray(new String[0]);
        System.out.println("First fruit in the array: " + fruitArray[0]); // Outputs: First fruit in the array: Grapes
    }

    public static void arrayExample() {
        // Creating and initializing an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Accessing elements by index
        System.out.println("Third number: " + numbers[2]); // Outputs: Third number: 3

        // Modifying elements
        numbers[1] = 10; // Change the second element to 10

        // Finding the length of the array
        int length = numbers.length;
        System.out.println("Array length: " + length); // Outputs: Array length: 5

        // Iterating through the array using a for loop
        System.out.println("All numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Iterating through the array using a for-each loop
        System.out.println("All numbers with a for-each loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Multi-dimensional array
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Accessing elements in a multi-dimensional array
        System.out.println("Element at row 2, column 3: " + matrix[1][2]); // Outputs: Element at row 2, column 3: 6

        // Iterating through a multi-dimensional array
        System.out.println("All elements in the matrix:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }

    public static void hashMapExample() {
        // Creating a HashMap with Integer keys and String values
        Map<Integer, String> students = new HashMap<>();

        // Adding key-value pairs to the HashMap
        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(3, "Charlie");
        students.put(4, "David");

        // Accessing values by key
        String name = students.get(2);
        System.out.println("Student with key 2: " + name); // Outputs: Student with key 2: Bob

        // Checking if a key exists in the HashMap
        boolean containsKey = students.containsKey(5);
        System.out.println("Does key 5 exist? " + containsKey); // Outputs: Does key 5 exist? false

        // Checking if a value exists in the HashMap
        boolean containsValue = students.containsValue("Charlie");
        System.out.println("Does value 'Charlie' exist? " + containsValue); // Outputs: Does value 'Charlie' exist? true

        // Removing a key-value pair from the HashMap
        students.remove(1);

        // Iterating through the HashMap using a for-each loop
        System.out.println("All students:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            int key = entry.getKey();
            String studentName = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + studentName);
        }

        // Size of the HashMap
        int size = students.size();
        System.out.println("Number of students: " + size); // Outputs: Number of students: 3
    }

    public static void hashSetExample() {
        // Creating a HashSet of strings
        Set<String> colors = new HashSet<>();

        // Adding elements to the HashSet
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Red"); // Duplicate elements are not allowed

        // Checking if an element exists in the HashSet
        boolean containsBlue = colors.contains("Blue");
        System.out.println("Contains Blue: " + containsBlue); // Outputs: Contains Blue: true

        // Removing an element from the HashSet
        colors.remove("Green");

        // Iterating through the HashSet using an Iterator
        Iterator<String> iterator = colors.iterator();
        System.out.println("All colors:");
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
        }

        // Using the enhanced for loop (for-each) to iterate
        System.out.println("All colors using for-each:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Size of the HashSet
        int size = colors.size();
        System.out.println("Number of colors: " + size); // Outputs: Number of colors: 3

        // Clearing the HashSet
        colors.clear();
        System.out.println("Is the HashSet empty? " + colors.isEmpty()); // Outputs: Is the HashSet empty? true
    }

    public static void listIteratorExample() {
        // Creating an ArrayList of strings
        List<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Fig");

        // Creating a ListIterator for bidirectional iteration
        ListIterator<String> listIterator = fruits.listIterator();

        // Iterating forward using ListIterator
        System.out.println("Forward iteration:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Iterating backward using ListIterator
        System.out.println("Backward iteration:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // Modifying elements during iteration (changing case)
        listIterator = fruits.listIterator();
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            listIterator.set(fruit.toUpperCase()); // Convert to uppercase
        }

        System.out.println("Modified list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }


    public static void main(String[] args) {
        arrayListExample();
        //arrayExample();
        //hashMapExample();
        //hashSetExample();
        //listIteratorExample();
        //ExampleOfStatic.stringFormatExample();

        //^^ With static methods, we call the Class (not the object) to invoke a static method.
        //static methods cannot contain class ivars (something good to know) bc static methods belong to
        //the class, not the object of the class
    }
}