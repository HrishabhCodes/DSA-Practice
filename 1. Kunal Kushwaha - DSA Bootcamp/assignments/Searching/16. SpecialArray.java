package com.hrishabh;

import java.util.Arrays;

public class SpecialArray {
    public static void main(String[] args) {
        int[] nums = {3};
        System.out.println(specialArray(nums));
    }

    static public int specialArray(int[] nums) {
        int x = nums.length;
        int[] counts = new int[x+1];

        for(int elem : nums)
            if(elem >= x)
                counts[x]++;
            else
                counts[elem]++;

        int res = 0;
        for(int i = counts.length-1; i > 0; i--) {
            res += counts[i];
            if(res == i)
                return i;
        }

        return -1;
    }

    /**************************** USING BINARY SEARCH ****************************
        static public int specialArray(int[] nums) {
            Arrays.sort(nums);
            int len = nums.length;
            // enumerate all possible number i
            for (int x = 0; x <= nums[len - 1]; x++) {
                // find the first index that nums[idx] >= i
                int idx = findFirstGreaterOrEqual(x, nums);
                if (len - idx == x) {
                    return x;
                }
            }
            return -1;
        }

        private int findFirstGreaterOrEqual(int target, int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            while (left + 1 < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] >= target) {
                    right = mid;
                } else {
                    left = mid;
                }
            }

            if (nums[left] >= target) {
                return left;
            }
            return right; // whether right >= target or right > target
        }
     */

    /**************************** BRUTE FORCE ****************************
        static int specialArray(int[] nums) {
            if (nums.length == 1 && nums[0] > 0) {
                return 1;
            }
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 1; i++) {
                int num = nums.length - i;
                if (i == 0 && nums[i] >= num) {
                    return num;
                }
                if (nums[i] < num || nums[i - 1] >= num) {
                    continue;
                }
                return num;
            }
            return -1;
        }
     */
}
