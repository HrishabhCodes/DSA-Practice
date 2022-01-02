package com.hrishabh;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FairCandySwaps {
    public static void main(String[] args) {
        int[] aliceSizes = {2};
        int[] bobSizes = {1,3};
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));
    }

    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        // ************ USING HASHSET ************

        int difference = 0;
        for (int x : aliceSizes) {
            difference -= x;
        }
        for (int x : bobSizes) {
            difference += x;
        }
        difference /= 2;
        Set<Integer> setB = new HashSet();
        for (int x: bobSizes) setB.add(x);
        for (int x: aliceSizes)
            if (setB.contains(x + difference))
                return new int[]{x, x + difference};
        return null;

//        ************ WITHOUT USING HASHSET ************


//        int aliceSum = 0;
//        for (int num : aliceSizes) {
//            aliceSum += num;
//        }
//        int bobSum = 0;
//        for (int num : bobSizes) {
//            bobSum += num;
//        }
//        Arrays.sort(bobSizes);
//        for (int i = 0; i < aliceSizes.length; i++) {
//            int target = (bobSum - aliceSum + 2 * aliceSizes[i]) / 2;
//            int requiredNum = search(bobSizes, target);
//            if (requiredNum != -1) {
//                return new int[]{aliceSizes[i], bobSizes[requiredNum]};
//            }
//        }
//        return null;
    }

     static int search(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
         while (s <= e) {
             int mid = s + (e - s) / 2;
             if (nums[mid] == target) {
                 return mid;
             } else if (nums[mid] > target) {
                 e = mid - 1;
             } else {
                 s = mid + 1;
             }
         }
         return -1;
    }
}
