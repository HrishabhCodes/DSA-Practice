package com.hrishabh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IntersectionII {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> elems = new ArrayList<>();
        int top = 0, bottom =  0;

        while (top < nums1.length && bottom < nums2.length) {
            if (nums1[top] == nums2[bottom]) {
                elems.add(nums1[top]);
                top++;
                bottom++;
            } else if (nums1[top] > nums2[bottom]) {
                bottom++;
            } else {
                top++;
            }
        }

        int[] ans = new int[elems.size()];
        int index = 0;
        for (int i: elems) {
            ans[index++] = i;
        }

        return ans;
    }
}