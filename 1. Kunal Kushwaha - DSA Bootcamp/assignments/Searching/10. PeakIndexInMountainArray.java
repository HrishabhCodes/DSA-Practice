package com.hrishabh;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 4, 5, 14, 11, 2, 1};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        int ans = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid+1]>arr[mid]){
                ans = mid+1;
                start = mid+1;
            } else{
                end = mid-1;
            }
        }
        return ans;
    }
}
