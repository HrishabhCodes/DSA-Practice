package com.hrishabh;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(grade(num));
    }

    static String grade(int num) {
        if (num>=91 && num<=100){
            return "AA";
        }else if (num>=81 && num<=90){
            return "AB";
        }else if (num>=71 && num<=80){
            return "BB";
        }else if (num>=61 && num<=70){
            return "BC";
        }else if (num>=51 && num<=60){
            return "CD";
        }else if (num>=41 && num<=50){
            return "DD";
        }else{
            return "FAIL";
        }
    }
}
