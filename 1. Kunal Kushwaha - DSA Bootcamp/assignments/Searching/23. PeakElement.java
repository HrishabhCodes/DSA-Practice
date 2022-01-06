package com.hrishabh;

public class PeakElement {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 3, 5, 3, 2};
        System.out.println(findPeakElement(nums));
    }


    static int findPeakElement(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        while(s < e){
            int m = s + (e - s) / 2;
            if (nums[m] > nums[m + 1]) {
                e = m;
            } else {
                s = m + 1;
            }
        }
        return s;
    }

/******************* My solution *******************
    static int findPeakElement(int[] nums) {
        int N = nums.length;
        if (N == 1) {
            return 0;
        } else if (N == 2) {
            if (nums[0] > nums[1]) {
                return 0;
            } else {
                return 1;
            }
        }
        int s = 0, e = N - 2;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] < nums[mid + 1]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return s;
    }
 */
}
