package com.hrishabh;

public class _278_FirstBadVersion {
    static int firstBadVersion(int n) {
        int ans = 0;
        int s = 1;
        int e = n;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isBadVersion(mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
}
