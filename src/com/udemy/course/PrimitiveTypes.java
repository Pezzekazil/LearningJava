package com.udemy.course;

public class PrimitiveTypes {
    public static void main(String[] args) {
        // 8 primitive types
        // We are looking at Byte Short Int Long for now

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value " + myMinIntValue);
        System.out.println("Integer Maximum Value " + myMaxIntValue);
        // Example of overflow
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));

    }
}
