package com.hrishabh;

class MaxValue {
    public static void main(String[] args) {
        int n = 4, index = 2,  maxSum = 6;
        System.out.println(maxValue(n, index, maxSum));
    }
     public static int maxValue(int n, int index, int maxSum) {
        maxSum -= n;
        int left = 0, right = maxSum, mid;
        while (left < right) {
            mid = (left + right + 1) / 2;
            if (test(n, index, mid) <= maxSum)
                left = mid;
            else
                right = mid - 1;
        }
        return left + 1;
    }
    
    static long test(int n, int index, int a) {
        int b = Math.max(a - index, 0);
        long res = (long)(a + b) * (a - b + 1) / 2;
        b = Math.max(a - ((n - 1) - index), 0);
        res += (long)(a + b) * (a - b + 1) / 2;
        return res - a;
    }
}