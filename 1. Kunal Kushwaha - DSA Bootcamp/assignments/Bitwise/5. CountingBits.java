package com.hrishabh;

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(Arrays.toString(count(n)));
    }

    private static int[] count(int n) {
        int[] ans = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            int count = 0;
            int temp = i;
            while (temp != 0) {
                if ((temp & 1) == 1) {
                    count++;
                }
                temp >>= 1;
            }
            ans[i] = count;
        }

        return ans;
    }
}
