package com.hrishabh;

import java.util.Arrays;

public class _26_RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    static int removeDuplicates(int[] nums) {

//        *************** BETTER ***************

                int n = nums.length;
                if (n == 0) return 0;

                int i = 0;

                for (int j = 1; j < n; j++) {
                    if (nums[i] != nums[j]){
                        i++;
                        nums[i] = nums[j];
                    }
                }
                return i + 1;

//        **************************************

//        int n = nums.length;
//        int ans = 1;
//        for (int i = 1; i < n; i++) {
//            if (nums[i] != nums[i - 1]) {
//                ans++;
//            }
//        }
//        int j = 1;
//        for (int i = 1; i < n; i++) {
//            if (j == ans) {
//                break;
//            }
//            if (nums[i] != nums[i - 1]) {
//                nums[j] = nums[i];
//                j++;
//            }
//        }
//        return ans;
    }
}
