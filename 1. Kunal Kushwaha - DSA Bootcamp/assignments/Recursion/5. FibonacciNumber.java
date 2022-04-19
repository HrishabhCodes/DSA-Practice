package com.hrishabh;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib(n));
    }

//    Recursion:

    private static int fib1(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib1(n - 1) + fib1(n - 2);
    }

//    Iteration:

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int ans = 0;
        int last = 1;
        int secLast = 0;
        for(int i = 2; i <= n; i++)  {
            ans = last + secLast;
            secLast = last;
            last = ans;
        }
        return ans;
    }
}
