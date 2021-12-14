package com.hrishabh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1773_ItemsMatchingARule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<List<String>>();
        String ruleKey = "type";
        String ruleValue = "phone";
//        items = {
//                {"phone", "blue", "pixel"},
//                {"computer", "silver", "lenovo"},
//                {"phone", "gold", "iphone"}
//        };
        System.out.println(countMatches(items, ruleKey, ruleValue));
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        /*
            *********** Method 1 ***********
            int count = 0;

            for (int i = 0; i < items.size(); i++) {
                if (ruleKey.equals("type")) {
                    if (items.get(i).get(0).equals(ruleValue)) {
                        count++;
                    }
                }
                if (ruleKey.equals("color")) {
                    if (items.get(i).get(1).equals(ruleValue)) {
                        count++;
                    }
                }
                if (ruleKey.equals("name")) {
                    if (items.get(i).get(2).equals(ruleValue)) {
                        count++;
                    }
                }
            }
            return count;
        */

//      *********** Method 2 ***********

        int matchesCount = 0;
        int ruleKeyIndex = Arrays.asList("type", "color", "name").indexOf(ruleKey);

        for (List l : items)
            matchesCount += (l.get(ruleKeyIndex).equals(ruleValue)) ? 1: 0;
        return matchesCount;
    }
}
