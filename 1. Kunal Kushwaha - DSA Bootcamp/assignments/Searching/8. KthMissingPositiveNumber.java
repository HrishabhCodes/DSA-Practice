package com.hrishabh;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {6};
        int k = 5;
        System.out.println(findKthPositive(arr, k));
    }

    /******************** O(log(n)) ********************/

     static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] - mid - 1 < k) start = mid + 1;
            else end = mid - 1;
        }
        return k + start;
    }

    /******************** O(n) ********************

             static int findKthPositive(int[] arr, int k) {
                for(int i : arr){
                    if(i <= k) k++;
                    else break;
                }
                return k;
            }
     */

/******************** BRUTE FORCE METHOD ********************

    private static int findKthPositive(int[] arr, int k) {
        int[] ans = new int[k];
        int ansIndex = 0;
        int itr = 0;
        int num = 1;
        while (ansIndex < k) {
            if (itr >= arr.length) {
                ans[ansIndex] = num;
                ansIndex++;
                num++;
                continue;
            }
            if (num != arr[itr]) {
                ans[ansIndex] = num;
                ansIndex++;
            } else {
                itr++;
            }
            num++;
        }
        return ans[k - 1];
    }
 */
}
