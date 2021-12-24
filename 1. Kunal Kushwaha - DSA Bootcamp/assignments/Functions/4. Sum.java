package com.hrishabh;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(sum(num1, num2));
    }

    static int sum(int num1, int num2) {
        return num1+num2;
    }
}
