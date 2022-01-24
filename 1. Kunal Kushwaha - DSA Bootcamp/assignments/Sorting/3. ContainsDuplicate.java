package com.hrishabh;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(containsDuplicate(nums));
    }

    static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i: nums){
            if(!set.add(i)) return true;
        }
        return false;
    }

/******************************** BRUTE FORCE ********************************

    static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }
*/
}
