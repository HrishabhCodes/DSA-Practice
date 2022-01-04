package com.hrishabh;

class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int start = 0, end = nums.length - 1;
        if (target >= nums[pivot] && target <= nums[nums.length - 1]) {
            start = pivot;
        } else {
            end = pivot;
        }
        return binarySearch(nums, target, start, end);
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        int s = start, e = end;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }

    static int findPivot(int[] nums) {
        int s = 0, e = nums.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (nums[e] > nums[mid]) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }
}