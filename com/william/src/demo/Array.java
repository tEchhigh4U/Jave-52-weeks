package com.william.src.demo;

import java.util.concurrent.ThreadLocalRandom;

public class Array {
    /* 隨機訪問元素 */
    public static int randomAccess(int[] nums) {
        // Check if array is empty to prevent IllegalArgumentException from Random
        if (nums.length == 0) {
            throw new IllegalArgumentException("Array MUST NOT be empty.");
        }

        // 在區間 [0, nums.length) 中隨機抽取一個數字
        int randomIndex = ThreadLocalRandom.current().nextInt(0, nums.length);
        // 獲取並返回隨機元素
        return nums[randomIndex];
    }

    /* 在陣列的索引 index 處插入元素 num */
    public int[] insert(int[] original, int num, int index) {
        if (index < 0 || index > original.length) {
            throw new IllegalArgumentException("Index out of bounds.");
        }

        // Create a new array of size original.length + 1
        int[] newArray = new int[original.length + 1];

        // Copy elements from the original array to the new array
        // up to the index
        for (int i = 0; i < index; i++) {
            newArray[i] = original[i];
        }

        // Insert the new element at the index
        newArray[index] = num;

        // Copy the rest of the original Array into the new Array
        for (int i = index; i < original.length; i++) {
            newArray[i + 1] = original[i];
        }

        return newArray;
    }

    // Method to remove an element at a specific index from an array
    public int[] remove (int[] nums, int index) {
        if (index < 0 || index > nums.length) {
            throw new IllegalArgumentException("Index out of bounds.");
        }

        int[] newArray = new int[nums.length - 1];

        // Copy elements from the original array, skipping the index of the element to be removed
        for (int i = 0, j = 0; i < nums.length; i++){
            if (i != index ) {
                newArray[j++] = nums[i];
            }
        }

        return newArray;
    }
}
