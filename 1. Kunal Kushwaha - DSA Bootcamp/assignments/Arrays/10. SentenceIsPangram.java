package com.hrishabh;

public class _1832_SentenceIsPangram {
    public static void main(String[] args) {
        String sentence = "Hrishabh";
        System.out.println(checkIfPangram(sentence));
    }

    static boolean checkIfPangram(String sentence) {
        /*
            *************** 1st Solution ***************

            boolean[] arr = new boolean[26];
            for (int i = 0; i < sentence.length(); i++) {
                int index = sentence.charAt(i) - 97;
                arr[index] = true;
            }
            for (int i = 0; i < arr.length; i++) {
                if (!arr[i]) {
                    return false;
                }
            }
            return true;
        */

//      *************** 2nd Solution using inbuilt string function ***************

        for(char i='a';i<='z';i++)
            if(!(sentence.contains(String.valueOf(i))))
                return false;

        return true;
    }
}
