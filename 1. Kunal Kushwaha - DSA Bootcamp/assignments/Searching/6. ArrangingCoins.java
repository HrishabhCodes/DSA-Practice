package com.hrishabh;

public class _441_ArrangingCoins {
    public static void main(String[] args) {
        int n = 2147483647;
        System.out.println(arrangeCoins(n));
    }

    static int arrangeCoins(int n) {
        long s = 1;
        long e = n / 2;
        while (s <= e) {
            long mid = s + (e - s) / 2;
            if (mid * (mid + 1) / 2 == n) {
                return (int)mid;
            } else if (mid / 2 > n / (mid + 1)) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return (int)(e);

        /**        *********** METHOD 2 ***********

         * Math: Using Sum of Integers Formula
         *
         * This problem can be reduced down to:
         *      (K * (K+1))/2 <= N
         *      K^2 + K <= 2*N
         *      (K + 1/2)^2 <= 2*N + 1/4
         *      K <= sqrt(2*N + 1/4) - 1/2
         *
         * Since we want the row that has full levels, we just need to return the floor of above result.
         * Thus, K = floor(sqrt(2*N + 1/4) - 1/2)
         *
         * Time Complexity: O(1)
         *
         * Space Complexity: O(1)


         if (n < 0) {
         throw new IllegalArgumentException("Input Number is invalid. Only positive numbers are allowed");
         }
         return (int) (Math.sqrt(2 * (long) n + 0.25) - 0.5);
         }

         **/
    }
}
