package com.hrishabh;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = {1,23,4,3};
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    static int[] runningSum(int[] nums) {

        /*
        Method 1:
        int[] newArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum+=nums[j];
            }
            newArr[i] = sum;
        }
        return newArr;
         */

//      Method 2:
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}
