package com.hrishabh;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,9,10,15};
        int target = 19;
        int start = 0;
        int end = arr.length-1;
        System.out.println(search(arr, start, end, target));
    }

    static int search(int[] arr, int start, int end, int target) {
        if (start > end){
            return -1;
        }

        int mid = start + (end - start)/2;

        if (arr[mid] == target){
            return mid;
        } else if (arr[mid] > target){
            end = mid-1;
        } else {
            start = mid + 1;
        }

        return search(arr, start, end, target);
    }
}
