package com.hrishabh;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, -1, -2, 9};
        maxMin(arr);
    }

    private static void maxMin(int[] arr) {
        helper(arr, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
    }

    private static void helper(int[] arr, int minValue, int maxValue, int i) {
        if (i == arr.length) {
            System.out.println(minValue + " " + maxValue);
            return;
        }
        if (arr[i] > maxValue) {
            maxValue = arr[i];
        }
        if (arr[i] < minValue) {
            minValue = arr[i];
        }
        helper(arr, minValue, maxValue, i + 1);
    }
}
