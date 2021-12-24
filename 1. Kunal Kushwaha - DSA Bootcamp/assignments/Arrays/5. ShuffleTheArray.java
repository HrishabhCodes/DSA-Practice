package com.hrishabh;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};
        int n = 4;
        System.out.println(Arrays.toString(shuffle(arr, n)));
    }

//    Method 1:

    static int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int index = 0;
        for (int i = 0; i < res.length; i++) {
            if (i % 2 == 0){
                res[i] = nums[index++];
            } else{
                res[i] = nums[n++];
            }
        }
        return res;
    }



    /*
    Method 2:

    static int[] shuffle(int[] nums, int n) {
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i <= (nums.length - 1) / 2; i++) {
            arr1[i] = nums[i];
            arr2[i] = nums[i+n];
        }

        for (int i = 0, j = 0; i < nums.length; i = i+2, j++) {
                nums[i] = arr1[j];
        }

        for (int i = 1, j = 0; i < nums.length; i = i+2, j++) {
                nums[i] = arr2[j];
        }
        return nums;
    }
    */
}
