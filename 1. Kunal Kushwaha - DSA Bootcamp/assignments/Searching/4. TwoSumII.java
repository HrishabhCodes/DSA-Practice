package com.hrishabh;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] numbers = {2,3,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    static int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;

        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) {
                break;
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return new int[]{l + 1,r + 1};
    }


//    static int[] twoSum(int[] numbers, int target) {
//        int[] ans = {-1, -1};
//        int e = numbers.length - 1;
//
//        for (int i = 0; i < e; i++) {
//            int found = search(numbers, target - numbers[i], i + 1, e);
//            if (found != -1) {
//                ans[0] = i + 1;
//                ans[1] = found + 1;
//                return ans;
//            }
//        }
//
//        return ans;
//    }
//
//     static int search(int[] numbers, int target, int start, int end) {
//        int s = start, e = end;
//        while (s <= e) {
//            int mid = s + (e - s) / 2;
//            if (numbers[mid] == target) {
//                return mid;
//            } else if (numbers[mid] < target) {
//                s = mid + 1;
//            } else {
//                e = mid - 1;
//            }
//        }
//        return -1;
//    }

}
