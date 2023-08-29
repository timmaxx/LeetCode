package com.leetcode.t0006_SlidingWindowMaximum;

public class Solution {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int lengthOfWindow = nums.length - k + 1;
        int[] arrOfMax = new int[lengthOfWindow];

        for (int i = 0; i < lengthOfWindow; i++) {
            int max = nums[i];

            if (        ( i > 0 ) // Для не нулевого окна
                    &&  ( nums[i - 1] < arrOfMax[i - 1])  // Если выбывший (т.е. слева) меньше максимального в предыдущем окне
                    &&  ( nums[i + k - 1] < arrOfMax[i - 1])) // Если прибывший (т.е. справа) меньше максимального в предыдущем окне
            {
                // Тогда максимум текущего окна совпадает с максимумом предыдущего окна
                arrOfMax[i] = arrOfMax[i - 1];
                continue;
            }

            // Иначе ищем максимум полным перебором
            for (int j = 1; j < k; j++) {
                if (nums[i + j] > max) {
                    max = nums[i + j];
                }
            }

            arrOfMax[i] = max;
        }

        return arrOfMax;
    }

/*  // This variant is too slow. (Time Limit Exceeded for k = 26779)
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int lengthOfWindow = nums.length - k + 1;
        int[] arrOfMax = new int[lengthOfWindow];

        for (int i = 0; i < lengthOfWindow; i++) {
            int max = nums[i];
            for (int j = 1; j < k; j++) {
                if (nums[i + j] > max) {
                    max = nums[i + j];
                }
            }
            arrOfMax[i] = max;
        }

        return arrOfMax;
    }
*/
}