package com.hrishabh;

import java.util.Arrays;

public class _1389_CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            if (ans[index[i]] == -1) {
                ans[index[i]] = nums[i];
            } else {
                insert(ans, index[i], nums[i]);
            }
        }
        return ans;
    }

    static void insert(int[] ans, int i, int num) {
        int j = ans.length - 2;
        while (j >= i) {
            ans[j + 1] = ans[j];
            j--;
        }
        ans[i] = num;
    }
}
