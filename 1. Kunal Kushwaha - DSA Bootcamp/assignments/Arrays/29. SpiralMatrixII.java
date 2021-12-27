package com.hrishabh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _59_SpiralMatrixII {
    public static void main(String[] args) {
        int n = 3;

        for (int[] arr: generateMatrix(n)) {
            System.out.println(Arrays.toString(arr));
        }
    }

    static int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];

        int left = 0, top = 0;
        int right = n - 1, down = n - 1;
        int count = 0;

        while (left <= right) {
            for (int i = left; i <= right; i++) {
                ans[top][i] = ++count;
            }
            top++;

            for (int i = top; i <= down; i++) {
                ans[i][right] = ++count;
            }
            right--;

            for (int i = right; i >= left; i--) {
                ans[down][i] = ++count;
            }
            down--;

            for (int i = down; i >= top; i--) {
                ans[i][left] = ++count;
            }
            left++;
        }

        return ans;
    }
}
