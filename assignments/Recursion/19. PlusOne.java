package com.hrishabh;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    static int[] plusOne(int[] arr) {
        long num = 0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            num = num*10 + arr[i];
        }
        num+=1;
        long temp = num;
        while(temp>0){
            temp/=10;
            count++;
        }
        int[] newArr = new int[count];
        int i = count - 1;
        while(num>0){
            newArr[i] = (int)num % 10;
            i--;
            num/=10;
        }
        return newArr;
    }
}
