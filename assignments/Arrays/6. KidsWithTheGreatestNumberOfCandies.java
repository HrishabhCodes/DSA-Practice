package com.hrishabh;

import java.util.ArrayList;
import java.util.List;

public class _1431_KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {12, 1, 12};
        int extraCandies = 10;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<Boolean>();

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }

        return ans;
    }
}
