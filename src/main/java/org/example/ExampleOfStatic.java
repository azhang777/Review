package org.example;

import java.util.Date;

public class ExampleOfStatic {

    public static void stringFormatExample() {
        // String.format method
        String name = "Alice";
        int age = 30;
        double salary = 45000.75;

        String formattedString = String.format("Name: %s, Age: %d, Salary: %.2f", name, age, salary);
        System.out.println("Formatted String using String.format:");
        System.out.println(formattedString);

        // printf method (equivalent to System.out.format)
        System.out.printf("Formatted String using printf:%nName: %s, Age: %d, Salary: %.2f%n", name, age, salary);

        // Specifying width and alignment
        int number = 42;
        System.out.printf("Width and alignment:%n%-10s: %d%n", "Number", number);

        // Formatting dates
        Date today = new Date();
        System.out.printf("Formatted Date: %tF%n", today); // Outputs: Formatted Date: 2023-10-27

        // Formatting floating-point numbers
        double value = 12345.6789;
        System.out.printf("Formatted Floating-Point Number: %.2f%n", value); // Outputs: Formatted Floating-Point Number: 12345.68

        // Formatting integers as hexadecimal
        int hexValue = 255;
        System.out.printf("Hexadecimal: %X%n", hexValue); // Outputs: Hexadecimal: FF
    }
}
