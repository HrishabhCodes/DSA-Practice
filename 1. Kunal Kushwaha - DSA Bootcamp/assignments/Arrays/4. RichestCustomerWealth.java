package com.hrishabh;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,4},
                {3,2,1}
        };
        System.out.println(maximumWealth(arr));
    }

     static int maximumWealth(int[][] accounts) {

        /*
        Method: 1

        int finalSum = 0;
         for (int[] arr: accounts
              ) {
             int sum = 0;
             for (int elem: arr
                  ) {
                sum+=elem;
             }
             if (finalSum<sum){
                 finalSum=sum;
             }
         }
         return finalSum;
         */

//         Method: 2

         int sum=0;
         int res=0;
         for(int i=0;i<accounts.length;i++)
         {
             for(int j=0;j<accounts[0].length;j++)
                 sum+=accounts[i][j];
             res=Math.max(res,sum);
             sum=0;
         }
         return res;
    }
}
