package com.hrishabh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _885_SpiralMatrixIII {
    public static void main(String[] args) {
        int rows = 5, cols = 6, rStart = 0, cStart = 0;
        for (int[] arr : spiralMatrixIII(rows, cols, rStart, cStart)) {
            System.out.println(Arrays.toString(arr));
        }
    }

    static int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int[][] dirt = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // east, south, west, north
        List<int[]> res = new ArrayList<>();
        int len = 0, d = 0; // move <len> steps in the <d> direction
        res.add(new int[]{r0, c0});
        while (res.size() < R * C) {
            if (d == 0 || d == 2) len++; // when move east or west, the length of path need plus 1
            for (int i = 0; i < len; i++) {
                r0 += dirt[d][0];
                c0 += dirt[d][1];
                if (r0 >= 0 && r0 < R && c0 >= 0 && c0 < C) // check valid
                    res.add(new int[]{r0, c0});
            }
            d = (d + 1) % 4; // turn to next direction
        }
        return res.toArray(new int[R * C][2]);
    }
}
