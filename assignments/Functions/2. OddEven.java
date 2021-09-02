package com.hrishabh;

public class OddEven {
    public static void main(String[] args) {
        int num = 24;
        System.out.println(isEven(num));
    }

    static boolean isEven(int num) {
        if (num%2==0){
            return true;
        }else
            return false;
    }
}
