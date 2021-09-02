package com.hrishabh;

public class EligibleToVote {
    public static void main(String[] args) {
        int age = 100;
        System.out.println(isEligible(age));
    }

    static boolean isEligible(int age) {
        if (age>=18){
            return true;
        }
        else{
            return false;
        }
    }
}
