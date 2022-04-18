package com.hrishabh;

public class IsUpper {
    public static void main(String[] args) {
        String str = "geekS";
        System.out.println(firstUpper(str));
    }

    private static char firstUpper(String str) {
        return helper(str, 0);
    }

    private static char helper(String str, int i) {
        if (Character.isUpperCase(str.charAt(i))) {
            return str.charAt(i);
        }
        return helper(str, i + 1);
    }
}
