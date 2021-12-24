package com.hrishabh;

public class Palindrome {
    public static void main(String[] args) {
        int num = 545;
        System.out.println(isPalindrome(num));
    }

    static boolean isPalindrome(int num) {
        int n = num, r;
        int sum=0;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n/=10;
        }
        if (sum==num){
            return true;
        }
        return false;
    }
}
