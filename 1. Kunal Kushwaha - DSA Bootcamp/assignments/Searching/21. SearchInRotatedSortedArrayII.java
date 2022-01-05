package com.hrishabh;

public class SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 3;
        System.out.println(search(nums, target));
    }

    static boolean search(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[e] == nums[mid]) {
                e--;
            } else if (nums[mid] < nums[e]) {
                if (nums[mid] < target && nums[e] >= target) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }else{
                if(target >= nums[s] && target < nums[mid])
                    e = mid - 1;
                else {
                    s = mid + 1;
                }
            }
        }
        return false;
    }
}
