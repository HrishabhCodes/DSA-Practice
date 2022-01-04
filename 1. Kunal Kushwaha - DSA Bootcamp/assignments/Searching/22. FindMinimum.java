package com.hrishabh;

public class FindMinimum {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(findMin(nums));
    }

    static int findMin(int[] nums) {
        int s = 0, e = nums.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (nums[e] > nums[mid]) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return nums[s];
    }
}
