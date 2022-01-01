package com.hrishabh;

import java.util.Arrays;
import java.util.HashSet;

class IntersectionI {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> elems = new HashSet<>();
        HashSet<Integer> copy = new HashSet<>();

        for (int i : nums1) {
            copy.add(i);
        }

        for (int j : nums2) {
            if (copy.contains(j)) {
                elems.add(j);
            }
        }

        int[] ans = new int[elems.size()];
        int index = 0;
        for (int num : elems) {
            ans[index++] = num;
        }
        return ans;
    }
}