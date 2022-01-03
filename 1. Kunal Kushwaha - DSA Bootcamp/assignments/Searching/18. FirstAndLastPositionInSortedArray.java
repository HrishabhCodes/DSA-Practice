package com.hrishabh;

import java.util.Arrays;

public class FirstAndLastPositionInSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 5, 5, 6, 6, 6, 7, 8, 8};
        int target = 3;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

    static int[] searchRange(int[] arr, int target) {
        int[] ans = new int[2];
        int firstPos = search(arr, target, true);
        int lasstPos = search(arr, target, false);
        ans[0] = firstPos;
        ans[1] = lasstPos;
        return ans;
    }

    static int search(int[] arr, int target, boolean isStart) {
        int ans = -1;
        int s = 0, e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] < target) {
                s = mid + 1;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                ans = mid;
                if (isStart) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }
        return ans;
    }

/****************************** BRUTE FORCE ******************************

    static int[] searchRange(int[] arr, int target) {
        int firstElemFound = binarySearch(arr, target);
        if (firstElemFound == -1) {
            return new int[]{-1, -1};
        }
        int firstAppearance = first(arr, firstElemFound);
        int lastAppearance = last(arr, firstElemFound);
        return new int[] {firstAppearance, lastAppearance};
    }

    static int last(int[] arr, int firstElemFound) {
        int i = firstElemFound + 1;
        while (i <= arr.length-1 && arr[i] == arr[firstElemFound]) {
                i++;
        }
        return i - 1;
    }

    static int first(int[] arr, int firstElemFound) {
        int i = firstElemFound - 1;
        while (i >= 0 && arr[i] == arr[firstElemFound] ) {
            i--;
        }
        return i + 1;
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

 */
}
