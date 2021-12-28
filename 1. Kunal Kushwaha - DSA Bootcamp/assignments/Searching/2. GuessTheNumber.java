package com.hrishabh;

public class _374_GuessTheNumber {
    static int guessNumber(int n) {
        int s = 1;
        int e = n;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == -1) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return 0;
    }
}
