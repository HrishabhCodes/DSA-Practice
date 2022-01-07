package com.hrishabh;

public class ReachANumber {
    public static void main(String[] args) {
        int target = -2;
        System.out.println(reachNumber(target));
    }

    static int reachNumber(int target) {
        if (target < 0) {
            target = -1 * target;
        }
        int jump = 1, curPos = 0, count = 0;
        while (true) {
            if (curPos + jump <= target) {
                curPos += jump;
                jump++;
            } else {
                curPos -= jump;
                jump++;
            }
            count++;
            if (target == curPos) {
                break;
            }
        }
        return count;
    }
}
