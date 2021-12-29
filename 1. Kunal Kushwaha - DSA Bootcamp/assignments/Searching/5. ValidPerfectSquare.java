package com.hrishabh;

public class _367_ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(isPerfectSquare(num));
    }

    static boolean isPerfectSquare(int num) {
        int s = 1;
        int e = num;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid * mid == num) {
                return true;
            } else if (mid < num / mid) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return false;
    }
}
