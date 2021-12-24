package com.hrishabh;

class _198_HouseRobber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(rob(nums));
    }

    static public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            dp[i + 1] = Math.max(dp[i], nums[i] + dp[i - 1]);
        }
        
        return dp[nums.length];
    }
}