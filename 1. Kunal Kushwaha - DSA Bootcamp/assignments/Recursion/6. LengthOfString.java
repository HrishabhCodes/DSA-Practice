package com.hrishabh;

public class LengthOfString {
    public static void main(String[] args) {
        String str = "absgvfdgdwgc";
//        System.out.println(len(str));
        System.out.println(len1(str));
    }

    /********* METHOD 1 *********/

    private static int len(String str) {
        return helper(str, 0, 0);
    }

    private static int helper(String str, int i, int count) {
        if (i == str.length()) {
            return count;
        }
        return helper(str, i + 1, count + 1);
    }

    /********* METHOD 2 *********/

    private static int len1(String str) {
        if (str.equals("")) {
            return 0;
        } else {
            return 1 + len1(str.substring(1));
        }
    }
}
