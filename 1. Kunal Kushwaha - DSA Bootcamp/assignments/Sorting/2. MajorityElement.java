package com.hrishabh;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,3,5,4,6,4,4,4,4};
        System.out.println(majorityElement(nums));
    }

//********************* BRUTE FORCE METHOD *********************

    static int majorityElement(int[] nums) {
        int N = nums.length;
        if (N == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        int major = 0, currCount = 1;
        for (int i = 1; i < N; i++) {
            if (nums[i] == nums[i - 1]) {
                currCount++;
                if (currCount > N / 2) {
                    major = nums[i - 1];
                    break;
                }
            } else {
                currCount = 1;
            }
        }
        return major;
    }
}
