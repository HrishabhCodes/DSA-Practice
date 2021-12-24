package com.hrishabh;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(isPowerOfTwo(n));
    }

    static boolean isPowerOfTwo(int n) {
        if (n==1){
            return true;
        }
        if (n%2!=0 || n==0){
            return false;
        }
        n /= 2;
        return isPowerOfTwo(n);
    }
}
