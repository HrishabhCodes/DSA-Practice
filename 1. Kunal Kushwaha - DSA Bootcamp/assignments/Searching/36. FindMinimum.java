package com.hrishabh;

class FindMinimum {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length-1;
	 while (l < r) {
		 int mid = (l + r) / 2;
		 if (nums[mid] < nums[r]) {
			 r = mid;
		 } else if (nums[mid] > nums[r]){
			 l = mid + 1;
		 } else {  
			 r--;  //nums[mid]=nums[r] no idea, but we can eliminate nums[r];
		 }
	 }
	 return nums[l];
    }
}