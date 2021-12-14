package com.hrishabh;

public class _1732_HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(gain));
    }

    static int largestAltitude(int[] gain) {
        int max = 0, sum = 0;
        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
