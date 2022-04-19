package com.hrishabh;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'l', 'o' };
        reverseString2(arr);
    }

//    Recursion:

    private static void reverseString1(char[] arr) {
        helper(arr, 0, arr.length - 1);
    }

    private static void helper(char[] arr, int i, int j) {
        if (i >= j) {
            return;
        }
        swap(arr, i, j);
        helper(arr, i + 1, j - 1);
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

//    Iteration:

    public static void reverseString2(char[] arr) {
        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
