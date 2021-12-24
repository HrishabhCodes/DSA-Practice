package com.hrishabh;

import java.util.Arrays;

public class _189_RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    static void rotate(int[] nums, int k) {
        int N = nums.length;
        k = k % N;

        reverse(nums, 0, N - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, N - 1);
    }

    static void reverse(int[] nums, int start, int end) {
        int N = nums.length;

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
