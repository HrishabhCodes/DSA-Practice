package com.hrishabh;

public class SumOfN {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));
    }

    static int sum(int i) {
        if (i == 1) {
            return 1;
        }
        return sum(i-1) + i;
    }
}
