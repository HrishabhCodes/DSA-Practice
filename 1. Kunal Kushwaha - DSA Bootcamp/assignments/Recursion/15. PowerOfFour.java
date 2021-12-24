package com.hrishabh;

public class PowerOfFour {
    public static void main(String[] args) {
        int n = 81;
        System.out.println(isPowerOfFour(n));
    }

    static boolean isPowerOfFour(int n) {
        if (n==1){
            return true;
        }
        if (n%4!=0 || n==0){
            return false;
        }
        n /= 4;
        return isPowerOfFour(n);
    }
}
