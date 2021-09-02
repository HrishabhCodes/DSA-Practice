package com.hrishabh;

import java.util.Scanner;

public class IsPythagorean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(isPythagorean(a,b,c));
    }

    static boolean isPythagorean(int a, int b, int c) {
        if ((a*a + b*b == c*c) || (b*b + c*c == a*a) || (a*a + c*c == b*b)){
            return true;
        }
        return false;
    }
}
