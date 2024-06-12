package Java_Cantonese_52.src.week4;

import java.util.Arrays;

public class Assignment2 {
    public static void main(String[] args) {
        int temp;
        int[] arr = {1, 33, 5, 77, 9, 12};
        System.out.println("Original array: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i+=2) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        System.out.println("Swapped array: " + Arrays.toString(arr));
    }
}
