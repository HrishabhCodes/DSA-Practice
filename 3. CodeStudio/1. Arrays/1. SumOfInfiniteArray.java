package com.hrishabh;

import java.util.ArrayList;
import java.util.List;

public class _1_SumOfInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 9};
        int n = 4;
        List<List<Integer>> queries = new ArrayList<List<Integer>>();
        List<Integer> q1 = new ArrayList<Integer>();
        q1.add(1);
        q1.add(5);
        List<Integer> q2 = new ArrayList<Integer>();
        q2.add(10);
        q2.add(13);
        queries.add(q1);
        queries.add(q2);
        int q = 2;
        System.out.println(sumInRanges(arr, n, queries, q));
    }

    static List<Integer> sumInRanges(int[] arr, int n, List<List<Integer>> queries, int q) {
        int mod =  1000000007;
        int N = arr.length;
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < queries.size(); i++) {
            long left = queries.get(i).get(0) - 1;
            long right = queries.get(i).get(1) - 1;
            int sum = 0;
            for (long j = left; j <= right; j++) {
                sum = (sum + arr[(int)(j % N)]) % mod;
            }
            ans.add(sum);
        }
        return ans;
    }
}
