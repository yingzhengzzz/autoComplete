package Chapter1;

import java.util.Arrays;

/**
 * 1.1 Write a program to solve the selection problem.
 * Let k = N/2.
 * Draw a table showing
 * the running time of your program for various values of N.
 */

public class Exercise1 {
    public static int[] bubbleSort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }


        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }


    public static void main(String[] args) {
        int[] input = {1, 6, 3, 4, 5, 0, 9, 10};
        System.out.println(Arrays.toString(bubbleSort(input)));
        System.out.println(bubbleSort(input).toString());
    }
}

