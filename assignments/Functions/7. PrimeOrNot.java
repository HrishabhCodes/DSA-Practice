package com.hrishabh;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(isPrime(num));
    }

    static boolean isPrime(int num) {
        for (int i = 2; i <= num-1; i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
