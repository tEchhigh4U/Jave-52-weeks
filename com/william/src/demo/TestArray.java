package com.william.src.demo;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        // Create an instance of RandomArray
        Array array = new Array();

        // Define an array of integers
        int[] nums = {10, 12, 25, 56, 78, 100};

        // Call the required method
        int randomInt = Array.randomAccess(nums);
        System.out.println("Random element: " + randomInt);

        // Call the insert method
        int[] insertedArray = array.insert(nums, 1,1);
        System.out.println("Updated array: " + Arrays.toString(insertedArray));

        int[] removedArray = array.remove(insertedArray, 2);
        System.out.println("Removed array: " + Arrays.toString(removedArray));
     }
}
