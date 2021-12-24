package com.hrishabh;

import java.util.Arrays;

public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] arr = {7,7,7,7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] array = new int[nums.length];
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]>nums[j]){
                    count++;
                }
            }
            array[i] = count;
        }
        return array;
    }
}
