package com.hrishabh;

public class PowerOfThree {
    public static void main(String[] args) {
        int n = 81;
        System.out.println(isPowerOfThree(n));
    }

    static boolean isPowerOfThree(int n) {
        if (n==1){
            return true;
        }
        if (n%3!=0 || n==0){
            return false;
        }
        n /= 3;
        return isPowerOfThree(n);
    }
}
