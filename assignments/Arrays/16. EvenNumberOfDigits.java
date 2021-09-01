package com.hrishabh;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums) {
        int evenDigitNumbers = 0;
        for (int elem: nums
             ) {
            int count = 0;
            while(elem>0){
                elem/=10;
                count++;
            }
            if (count%2==0){
                evenDigitNumbers++;
            }
        }
        return evenDigitNumbers;
    }
}
