package com.hrishabh;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'H', 'a', 'n', 'n', 'a'};
        reverse(s);
        System.out.println(Arrays.toString(s));
    }

    static void reverse(char[] s) {
        helper(s, 0);
    }

    static void helper(char[] s, int i) {
        if (i == s.length / 2) {
            return;
        }
        swap(s, i, s.length - 1 - i);
        helper(s, i + 1);
    }

    private static void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

}
