package com.hrishabh;

import java.util.Arrays;

public class DecodeXORArray {
    public static void main(String[] args) {
        int[] encoded = {6,2,7,3};
        int first = 4;
        System.out.println(Arrays.toString(decode(encoded, first)));
    }

    private static int[] decode(int[] encoded, int first) {
        int N = encoded.length;
        int[] arr = new int[N + 1];
        arr[0] = first;
        for (int i = 0; i < N; i++) {
            arr[i + 1] = arr[i] ^ encoded[i];
        }
        return arr;
    }
}
