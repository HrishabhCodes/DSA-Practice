package com.hrishabh;

import java.util.Arrays;

public class FindRightInterval {
    public static void main(String[] args) {
        int[][] intervals = {
                {3,4},
                {2,3},
                {1,2}
        };
        System.out.println(Arrays.toString(findRightInterval(intervals)));
    }

//    This question can be done using Map as well [O(nlogn)], but haven't studied it yet 🥲

    /************************ BRUTE FORCE ************************/
        static int[] findRightInterval(int[][] intervals) {
            int N = intervals.length;
            int[] ans = new int[N];

            for (int i = 0; i < N; i++) {
                int right = -1;
                for (int j = 0; j < N; j++) {
                    if (intervals[i][1] > intervals[j][0]) {
                        continue;
                    }
                    if (intervals[i][1] <= intervals[j][0]) {
                        if (right == -1) {
                            right = j;
                        }
                        if (intervals[right][0] > intervals[j][0]) {
                            right = j;
                        }
                    }
                }
                ans[i] = right;
            }

            return ans;
        }

}
