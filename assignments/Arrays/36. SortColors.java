/*

We just have to sort the array, for now I have just solved this by Selection Sort which is not a
good sorting algorithm with a time complexity of O(n^2). I will resolve it after studying advanced
sorting algorithms like Quick Sort and all.

 */


package com.hrishabh;

import java.util.Arrays;

public class _75_SortColors {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (nums[j] < nums[min_idx])
                    min_idx = j;

            int temp = nums[min_idx];
            nums[min_idx] = nums[i];
            nums[i] = temp;
        }
    }
}
