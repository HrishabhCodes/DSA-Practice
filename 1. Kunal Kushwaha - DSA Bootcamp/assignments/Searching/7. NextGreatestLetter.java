package com.hrishabh;

public class _744_NextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j' };
        char target = 'd';
        System.out.println(nextGreatestLetter(letters, target));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length - 1;

        while(s<=e){
            int mid = s + (e-s)/2;
            if (letters[mid]<=target){
                s = mid+1;
            }
            else{
                e = mid - 1;
            }
        }
        return letters[s % letters.length];
    
//      ************** Brute Force Method **************
//
//        if (target >= letters[e]) {
//            return letters[0];
//        }
//
//        while (s <= e) {
//            int mid = s + (e - s) / 2;
//            if (letters[mid] == target) {
//                return letters[mid + 1];
//            } else if (letters[mid] > target) {
//                e = mid - 1;
//            } else {
//                s = mid + 1;
//            }
//        }
//
//        return letters[s];

    }
}
