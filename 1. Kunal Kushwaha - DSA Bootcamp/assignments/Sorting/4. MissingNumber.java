package com.hrishabh;

// Link: https://leetcode.com/problems/missing-number/
// Amazon Question

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < arr.length && arr[i] != i) {
                swap(arr, i, arr[i]);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }

        return arr.length;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
