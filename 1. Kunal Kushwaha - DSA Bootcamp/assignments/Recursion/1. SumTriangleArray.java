package com.hrishabh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumTriangleArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        sumArray(arr);
    }

    private static void sumArray(int[] arr) {
        if (arr.length < 1) {
            return;
        }
        int[] temp = new int[arr.length - 1];

        for (int i = 0; i < temp.length; i++) {
            int x = arr[i] + arr[i + 1];
            temp[i] = x;
        }
        sumArray(temp);

        System.out.println(Arrays.toString(arr));
    }
}
