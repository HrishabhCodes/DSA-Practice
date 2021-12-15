package com.hrishabh;

import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] arr = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        setZeroes(arr);
        for (int[] array: arr
             ) {
        System.out.println(Arrays.toString(array));
        }
    }

    static void setZeroes(int[][] matrix) {
        int[] arri = new int[matrix.length];
        int[] arrj = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==0){
                    arri[i]++;
                    arrj[j]++;
                }
            }
        }
        for (int i = 0; i < arri.length; i++) {
            if (arri[i]>0){
                setRowZero(matrix , i);
            }
        }
        for (int i = 0; i < arrj.length; i++) {
            if (arrj[i]>0){
                setColZero(matrix , i);
            }
        }

    }

    static void setColZero(int[][] matrix, int i) {
        for (int j = 0; j < matrix.length; j++) {
            matrix[j][i]=0;
        }
    }

    static void setRowZero(int[][] matrix, int i) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[i][j]=0;
        }
    }
}

