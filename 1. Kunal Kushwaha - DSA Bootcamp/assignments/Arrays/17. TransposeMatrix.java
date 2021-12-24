package com.hrishabh;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6}
        };
        transpose(arr);
        for (int[] elem: transpose(arr)
             ) {
        System.out.println(Arrays.toString(elem));
        }
    }

    static int[][] transpose(int[][] matrix) {
        int[][] newArr = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                newArr[i][j] = matrix[j][i];
            }
        }
        return newArr;
    }
}

