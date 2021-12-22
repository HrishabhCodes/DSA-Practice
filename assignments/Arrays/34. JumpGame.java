package com.hrishabh;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2, 0, 0};
        System.out.println(canJump(nums));
    }

    static boolean canJump(int[] nums) {
        int N = nums.length;
        int lastGoodIndex = N - 1;
        for (int i = N - 1; i >= 0; i--) {
            if (i + nums[i] >= lastGoodIndex) {
                lastGoodIndex = i;
            }
        }
        return lastGoodIndex == 0;
    }
}
