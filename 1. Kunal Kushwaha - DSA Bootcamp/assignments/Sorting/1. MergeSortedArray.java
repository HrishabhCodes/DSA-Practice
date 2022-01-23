package com.hrishabh;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int m = 3, n = 3;
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, nums2, m, n);
        System.out.println(Arrays.toString(nums1));
    }

    static void merge(int[] nums1, int[] nums2, int m, int n) {
        int[] tempArr = new int[m + n];
        int i = 0, j = 0, index = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                tempArr[index++] = nums1[i++];
            } else {
                tempArr[index++] = nums2[j++];
            }
        }

        while (j < n) {
            tempArr[index++] = nums2[j++];
        }

        while (i < m) {
            tempArr[index++] = nums1[i++];
        }

        for (int k = 0; k < tempArr.length; k++) {
            nums1[k] = tempArr[k];
        }
    }
}
