package com.hrishabh;

import java.util.Arrays;

public class _1886_MatrixByRotation {
    public static void main(String[] args) {
        int[][] mat = {{1}};
        int[][] target = {{0}};
        System.out.println(findRotation(mat, target));
    }

    static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            mat = rotate(mat);
        }
        return false;
    }

    static int[][] rotate(int[][] mat) {
        int n = mat.length;
        int[][] newArr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newArr[i][j] = mat[n - j - 1][i];
            }
        }
        return newArr;
    }
}
