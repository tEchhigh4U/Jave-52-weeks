package main.src.week4;

import java.util.Arrays;

public class Assignment3_LoopForDesignatedNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 70, 9};
        int min = 10000;
        int max = -9999;
        int secondLargest = -9999;

        for (int i = 0; i < arr.length; i++) {
            // for min number
            if (arr[i] < min) {
                min = arr[i];
            }

            // update max and second largest number
            if (arr[i] > max) {
                secondLargest = max;
                max = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != max) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Min number is " + min);
        System.out.println("Max number is " + max);
        System.out.println("Second Largest number is " + secondLargest);
        System.out.println(Arrays.toString(arr));
    }

//    public void example(){
//        int[] arr = {1, 3, 2, 70, 9};
//        int min = 10000;
//        int max = -9999;
//        int secondLargest = -9999;
//
//        // loop for minimum number
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            } else if (arr[i] > max) {
//                max = arr[i];
//            }
//
//            // Loop for second larges number
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] > arr[i]) {
//                    secondLargest = arr[j];
//                }
//            }
//        }
//        System.out.println("Min number is " + min);
//        System.out.println("Max number is " + max);
//        System.out.println("Second Largest number is " + secondLargest);
//        System.out.println(Arrays.toString(arr));
//    }
}
