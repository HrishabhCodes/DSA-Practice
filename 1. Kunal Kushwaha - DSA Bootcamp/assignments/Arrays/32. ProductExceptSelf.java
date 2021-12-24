/*

Time Complexity: O(n)
                 Without division
Space Complexity: O(1)

 */

package com.hrishabh;

import java.util.Arrays;

public class _238_ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    static int[] productExceptSelf(int[] nums) {
        int N = nums.length;

        int[] output_array = new int[N];

        output_array[0] = 1;

        for (int i = 1; i < N; i++) {
            output_array[i] = output_array[i - 1] * nums[i - 1];
        }

        int right_product = 1;

        for (int i = N - 1; i >= 0; i--) {
            output_array[i] = right_product * output_array[i];
            right_product *= nums[i];
        }

        return output_array;
    }
}

// ****************************************************************************************************

/*

Time Complexity: O(n)
                 Without division
Space Complexity: O(n)

 */

//package com.hrishabh;
//
//import java.util.Arrays;
//
//public class _238_ProductExceptSelf {
//    public static void main(String[] args) {
//        int[] nums = {-1, 1, 0, -3, 3};
//        System.out.println(Arrays.toString(productExceptSelf(nums)));
//    }
//
//    static int[] productExceptSelf(int[] nums) {
//        int N = nums.length;
//
//        int[] left_products = new int[N];
//        int[] right_products = new int[N];
//
//        int[] output_array = new int[N];
//
//        left_products[0] = 1;
//        right_products[N - 1] = 1;
//
//        for (int i = 1; i < N; i++) {
//            left_products[i] = left_products[i - 1] * nums[i - 1];
//        }
//
//        for (int i = N - 2; i >= 0; i--) {
//            right_products[i] = right_products[i + 1] * nums[i + 1];
//        }
//
//        for (int i = 0; i < N; i++) {
//            output_array[i] = right_products[i] * left_products[i];
//        }
//
//        return output_array;
//    }
//}
