package com.hrishabh;

import java.util.ArrayList;
import java.util.List;

public class _1380_LuckyNumbers {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };
        System.out.println(luckyNumbers(matrix));
    }

    private static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();

        /*
            ************** Method 1 **************

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    int num = matrix[i][j];
                    if (isRowMin(matrix, i, num) && isColMax(matrix, j, num)) {
                        ans.add(matrix[i][j]);
                    }
                }
            }
        */

//        ********* Method 2 *********

        int colMax;

        for (int i = 0; i < matrix[0].length; i++) {
            colMax = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] > matrix[colMax][i]) {
                    colMax = j;
                }
            }

            if (isRowMin(matrix, colMax, matrix[colMax][i])) {
                ans.add(matrix[colMax][i]);
            }
        }
        return ans;
    }

    private static boolean isColMax(int[][] matrix, int j, int num) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][j] > num) {
                return false;
            }
        }
        return true;
    }

    private static boolean isRowMin(int[][] matrix, int j, int num) {
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[j][i] < num) {
                return false;
            }
        }
        return true;
    }
}
