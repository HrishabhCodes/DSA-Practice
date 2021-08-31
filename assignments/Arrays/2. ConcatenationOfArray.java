package com.hrishabh;

import java.util.Arrays;

public class ConcatenationOfArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(Arrays.toString(concatenate(nums)));;
    }

    static int[] concatenate(int[] nums) {
        int[] arr = new int[nums.length*2];

        for (int i = 0; i < arr.length/2; i++) {
            arr[i] = nums[i];
            arr[i + nums.length] = nums[i];
        }
        return arr;
    }
}
