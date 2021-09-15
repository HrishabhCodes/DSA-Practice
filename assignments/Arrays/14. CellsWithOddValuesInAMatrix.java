package com.hrishabh;

public class _1252_CellsWithOddValuesInAMatrix {
    public static void main(String[] args) {
        int m = 3, n = 2;
        int[][] indices = {
                {1,1},
                {0,0}
        };
        System.out.println(oddCells(m , n , indices));
    }

    static int oddCells(int m, int n, int[][] indices) {
        int ans = 0;
        int[][] arr = new int[m][n];

        for (int i = 0; i < indices.length; i++) {
                int rowIncrement = indices[i][0];
                for (int j = 0; j < n; j++) {
                    arr[rowIncrement][j]++;
                }
                int colIncrement = indices[i][1];
                for (int j = 0; j < m; j++) {
                    arr[j][colIncrement]++;
                }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] % 2 != 0) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
