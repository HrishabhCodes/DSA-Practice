package com.hrishabh;

class SingleNonDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(search(nums));
    }

    public static int search(int[] nums) {
        int left = 0, right = nums.length-1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if( (mid % 2 == 0 && nums[mid] == nums[mid +1]) || (mid %2 == 1 && nums[mid] == nums[mid - 1]) )
                left = mid + 1;
            else
                right = mid;
        }
        return nums[left];
    }

}