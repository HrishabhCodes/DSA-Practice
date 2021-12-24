package com.hrishabh;

public class SumOfFirstNaturalNumbers {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));
    }

    static int sum(int n) {
        return (n*(n+1))/2;
    }
}
