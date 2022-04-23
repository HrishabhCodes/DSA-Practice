package com.hrishabh;

public class XORoperationInArray {
    public static void main(String[] args) {
        int n = 5, start = 0;
        System.out.println(xorOperation(n, start));
    }

    static public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        int ans = 0;

        for(int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
            ans ^= nums[i];
        }

        return ans;
    }
}
