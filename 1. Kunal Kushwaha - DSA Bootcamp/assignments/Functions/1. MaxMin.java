package com.hrishabh;

import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(max(a,b,c));
        System.out.println(min(a,b,c));
    }

    static int min(int a, int b, int c) {
        int min;
        if (a<b && a<c){
            min = a;
        } else if(b<c){
            min = b;
        }else
            min=c;
        return min;
    }

    static int max(int a, int b, int c) {
        int max;
        if (a>b && a>c){
            max = a;
        } else if(b>c){
            max = b;
        }else
            max=c;
        return max;
    }
}
