package com.hrishabh;

import java.util.Arrays;

public class BinarySearch2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1}
        };
        int target = 0;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target) {
        int m = arr[0].length;
        int n = arr.length;
        int s = 0;
        int e = m * n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid / m][mid % m] == target) {
                return new int[]{mid / m, mid % m};
            } else if (arr[mid / m][mid % m] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }
}
