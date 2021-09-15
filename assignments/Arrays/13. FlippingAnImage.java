package com.hrishabh;

import java.util.Arrays;

public class _832_FlippingAnImage {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0,0},
                {1,0,0,1},
                {0,1,1,1},
                {1,0,1,0}
        };
        int[][] ans = flipAndInvertImage(arr);
        for (int[] elem :
                ans) {
            System.out.println(Arrays.toString(elem));
        }
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j <= (image[i].length-1)/2; j++) {
                swap(image, i ,j);
            }
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 0){
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }

    static void swap(int[][] arr, int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[i][arr.length-1-j];
        arr[i][arr.length-1-j] = temp;
    }
}
