package com.hrishabh;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(diagonalSum(arr));
    }

    static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            if ((mat.length - i - 1) == i) {
                sum += mat[i][i];
            } else {
                sum = sum + mat[i][i] + mat[i][mat.length - i - 1];
            }
        }
        return sum;
    }
}
