package com.hrishabh;

public class Sqrt {
    public static void main(String[] args) {
        int x = 2147395598;
        System.out.println(sqrt(x));
    }

    static int sqrt(int x) {
        if (x <= 1) {
            return x;
        }

        int s = 1;
        int e = x - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid < (x/mid)) {
                s = mid + 1;
            } else if (mid == (x/mid)) {
                return mid;
            } else {
                e = mid - 1;
            }
        }
        return s - 1;
    }
}
