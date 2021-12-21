package com.hrishabh;

public class _53_MaxSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

    static int maxSubArray(int[] nums) {
        int N = nums.length;
        int max_sum = Integer.MIN_VALUE;
        int sum = nums[0];

        for (int i = 1; i < N; i++) {
            sum = Math.max(nums[i] + sum, nums[i]);
            max_sum = Math.max(sum, max_sum);
        }

        return max_sum;
    }
}
