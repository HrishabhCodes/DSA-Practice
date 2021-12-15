package com.hrishabh;

public class _1572_MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };
        System.out.println(diagonalSum(mat));
    }

    static int diagonalSum(int[][] mat) {

//        ************* Method 1 *************

//        int sum=0;
//        for (int i = 0; i < mat.length; i++) {
//            if ((mat.length-i-1)==i){
//                sum += mat[i][i];
//            }
//            else{
//                sum = sum + mat[i][i] + mat[i][mat.length-i-1];
//            }
//        }
//        return sum;

//        ************* Method 2 *************
        
        int ans = 0;
        if (mat.length == 1) {
            return mat[0][0];
        }
        for (int i = 0; i < mat.length; i++) {
            ans += mat[i][i];
        }
        for (int i = 0; i < mat.length; i++) {
            ans += mat[i][mat.length - 1 - i];
        }
        if (mat.length % 2 != 0) {
            ans -= mat[mat.length/2][mat.length/2];
        }
        return ans;
    }
}
