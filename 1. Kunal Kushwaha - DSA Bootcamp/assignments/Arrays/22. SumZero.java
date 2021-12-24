package com.hrishabh;

import java.util.Arrays;

public class SumZero {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.toString(sumZero(n)));
    }

    static int[] sumZero(int n) {
        int[] arr = new int[n];
        if (n==1){
            arr[0]=0;
            return arr;
        }
        arr[0]=1;
        for (int i = 1; i < n-1; i++) {
            arr[i]+=arr[i-1]+1;
        }
        arr[n-1]=(n*(n-1))/2*-1;
        return arr;
    }
}
