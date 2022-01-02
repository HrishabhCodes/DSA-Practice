package com.hrishabh;

import java.util.Arrays;
import java.util.HashSet;

class CheckIfNandItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = {-10,12,-20,-8,15};
        System.out.println(checkIfExist(arr));
    }

    static boolean checkIfExist(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num * 2) || (num % 2 == 0 && seen.contains(num / 2))) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }


    /****************** BRUTE FORCE ********************
        static boolean checkIfExist(int[] arr) {
            Arrays.sort(arr);
            int start , end;
            for (int i = 0; i < arr.length - 1; i++) {
                int target = arr[i] * 2;
                if (arr[i] < 0) {
                     start = 0;
                     end = i;
                } else {
                    start = i + 1;
                    end = arr.length - 1;
                }
                if (hasDouble(arr, target, start, end)) {
                    return true;
                }
            }
            return false;
        }

        static boolean hasDouble(int[] arr, int target, int start, int end) {
            int s = start, e = end;
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (arr[mid] == target) {
                    return true;
                } else if (arr[mid] > target) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
            return false;
        }
    */
}