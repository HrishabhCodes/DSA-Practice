package com.hrishabh;

public class GoodPairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(goodPairs(arr));
    }

    static int goodPairs(int[] nums) {
        int counter = 0;
        for (int i = 0; i <= nums.length - 2; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]==nums[j]){
                    counter++;
                }
            }
        }
        return counter;
    }
}
