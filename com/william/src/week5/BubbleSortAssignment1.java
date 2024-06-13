package com.william.src.week5;

// Demo
public class BubbleSortAssignment1 {
    public static void main(String[] args) {
        int[] arr1 = {5, 3, 8, 4, 6, 20, 11, 3, 5};

        // outer loop for entire array
        for(int j =0; j < arr1.length - 1; j++){
            boolean swapped = false;

            // inner loop -> comparison and swap
            // arr1.length - 1 -j due to the largest number is at the end of the array
            for (int i = 0; i < arr1.length - 1 - j; i++) {
                if (arr1[i] > arr1[i + 1]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[i + 1];
                    arr1[i + 1] = temp;

                    swapped = true;
                }
            }

            // if swap is completed, array is sorted
            if (!swapped) {
                break;
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println();
    }
}
