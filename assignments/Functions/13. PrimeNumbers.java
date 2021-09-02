package com.hrishabh;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("All prime numbers between " + num1 + " and " + num2 + ":");
        primeNumbers(num1, num2);
    }

    static void primeNumbers(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int i) {
        for (int j = 2; j < i; j++) {
            if (i%j==0){
                return false;
            }
        }
        return true;
    }
}
