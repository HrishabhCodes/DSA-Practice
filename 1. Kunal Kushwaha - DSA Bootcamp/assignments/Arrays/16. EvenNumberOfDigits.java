package com.hrishabh;

public class _1295_EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {252};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums) {
        int evenDigitNumbers = 0;
//        *************** Method 1 ***************
//        for (int elem: nums
//        ) {
//            int count = 0;
//            while(elem>0){
//                elem/=10;
//                count++;
//            }
//            if (count%2==0){
//                evenDigitNumbers++;
//            }
//        }
        
//        *************** Method 2 ***************

        for (int num :
                nums) {
            int totalDigits = (int) (Math.log10(num) + 1);
            if (totalDigits % 2 == 0) {
                evenDigitNumbers++;
            }
        }
        
        return evenDigitNumbers;
    }
}
