package com.hrishabh;

class _1250_GoodArray {
    public static void main(String[] args) {
        int[] nums = {18,18,18,15,54,45,45,45};
        System.out.println(isGoodArray(nums));
    }

    static boolean isGoodArray(int[] nums) {
        int N = nums.length;
        int ans = nums[0];
        for (int i = 1; i < N; i++) {
            ans = gcd(ans, nums[i]);
        }
        return ans == 1;
    }

    static int gcd(int a, int b) {
        int smaller = Math.min(a, b);
        int greater = Math.max(a, b);
        while (smaller != 0) {
            int k = greater % smaller;
            greater = smaller;
            smaller = k;
        }
        return greater;
    }

}