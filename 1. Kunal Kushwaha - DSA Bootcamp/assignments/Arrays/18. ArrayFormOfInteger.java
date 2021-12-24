package com.hrishabh;

import java.util.ArrayList;
import java.util.List;

public class _989_ArrayFormOfInteger {
    public static void main(String[] args) {
        int[] num = {2, 7, 4};
        int k = 181;
        System.out.println(addToArrayForm(num, k));
    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = num.length - 1; i >= 0; --i) {
            res.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }
        while (k > 0) {
            res.add(0, k % 10);
            k /= 10;
        }
        return res;
    }
}
