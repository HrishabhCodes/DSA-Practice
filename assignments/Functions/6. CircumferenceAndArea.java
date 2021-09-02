package com.hrishabh;

import java.util.Scanner;

public class CircumferenceAndArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();
        System.out.println(circumference(radius));
        System.out.println(area(radius));
    }

    static double area(int radius) {
        double area = 3.14 * radius * radius;
        return area;
    }

    static double circumference(int radius) {
        double circumference = 2 * 3.14 * radius;
        return circumference;
    }
}
