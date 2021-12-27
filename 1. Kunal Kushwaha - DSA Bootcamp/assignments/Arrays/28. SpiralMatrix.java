package com.hrishabh;

import java.util.ArrayList;
import java.util.List;

public class _54_SpiralMatrix {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(spiralOrder(nums));
    }

    static List<Integer> spiralOrder(int[][] nums) {
        int rows = nums.length;
        int columns = nums[0].length;
        List<Integer> ans = new ArrayList<Integer>();

        int rowBegin = 0;
        int rowEnd = rows - 1;
        int colBegin = 0;
        int colEnd = columns - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            for (int i = colBegin; i <= colEnd; i++) {
                ans.add(nums[rowBegin][i]);
            }
            rowBegin++;

            for (int i = rowBegin; i <= rowEnd; i++) {
                ans.add(nums[i][colEnd]);
            }
            colEnd--;

            if (rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
                    ans.add(nums[rowEnd][i]);
                }
                rowEnd--;
            }
            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    ans.add(nums[i][colBegin]);
                }
                colBegin++;
            }
        }

        return ans;
    }
}
