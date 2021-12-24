package com.hrishabh;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(factorial(num));
    }

    static int factorial(int num) {
        int factorial = 1;
        for (int i = num; i > 0; i--) {
            factorial*=i;
        }
        return factorial;
    }
}
