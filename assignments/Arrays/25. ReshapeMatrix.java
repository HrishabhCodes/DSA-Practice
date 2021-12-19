package com.hrishabh;

import java.util.Arrays;

public class _566_ReshapeMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        int r = 1, c = 4;
        for (int[] arr :
                matrixReshape(mat, r, c)) {
            System.out.println(Arrays.toString(arr));
        }
    }

    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if (r * c != m * n) {
            return mat;
        }
        int[][] ans = new int[r][c];

        /* Method 1: */

        for (int i = 0; i < m * n; i++) {
            ans[i / c][i % c] = mat[i / n][i % n];
        }

        /*
        Method 2

            int[][] ans = new int[r][c];
            int currentRow = 0;
            int currentCol = 0;
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    if (currentCol < c) {
                        ans[currentRow][currentCol] = mat[i][j];
                        currentCol += 1;
                    } else {
                        currentRow += 1;
                        currentCol = 0;
                        ans[currentRow][currentCol] = mat[i][j];
                        currentCol += 1;
                    }
                }
            }
        */
        return ans;
    }
}
