package com.hrishabh;

public class AddBinary {
    public static void main(String[] args) {
        String a = "11", b = "1";
        System.out.println(addBinary(a, b));
    }

    private static String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        int diff = a.length() - b.length();
        for (int i = 1; i <= diff; i++) {
            b = "0" + b;
        }
        int carry = 0;
        String ans = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            int sum = carry + (int) (a.charAt(i)) + (int) (b.charAt(i)) - 96;
            if (sum == 0 || sum == 1) {
                carry = 0;
                ans = sum + ans;
            } else if (sum == 2) {
                carry = 1;
                ans = "0" + ans;
            } else if (sum == 3) {
                carry = 1;
                ans = "1" + ans;
            }
        }
        if (carry == 1) {
            return "1" + ans;
        }
        return ans;
    }
}
