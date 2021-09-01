package com.hrishabh;

import java.util.Arrays;

public class LargestAltitude {
    public static void main(String[] args) {
        int[] arr = {-1,-3,-5,0,2,4,5};
        System.out.println(largestAltitude(arr));
    }

    static int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length+1];
        arr[0]=0;
        arr[1]=gain[0];
        int max = arr[0];
        for (int i = 2; i < arr.length; i++) {
            arr[i]=gain[i-1]+arr[i-1];
            if (max < arr[i]) {
                max=arr[i];
            }
        }
        return max;
    }
}
