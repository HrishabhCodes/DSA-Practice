package com.hrishabh;

public class CountNegatives {

//  *************** Optimal Solution - O(mlog(n)) ***************

    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1}, {3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(count(grid));
    }

    static int count(int[][] grid) {
        int totalNegatives = 0;
        for (int i = 0; i < grid.length; i++) {
            int firstNeg = searchFirstNeg(grid[i]);
            int len = grid[i].length;
            totalNegatives += len - (firstNeg != -1 ? firstNeg : len);
        }
        return totalNegatives;
    }

    static int searchFirstNeg(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] < 0) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

//    *********** Brute Force Method - O(mn) ***********
//
//        static int count(int[][] grid) {
//            int count = 0;
//            for (int[] arr: grid) {
//                for (int num : arr) {
//                    if (num < 0) {
//                        count++;
//                    }
//                }
//            }
//            return count;
//        }
}
