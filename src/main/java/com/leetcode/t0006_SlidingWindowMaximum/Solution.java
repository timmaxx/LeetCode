package com.leetcode.t0006_SlidingWindowMaximum;

public class Solution {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int lengthOfWindow = nums.length - k + 1;
        int[] arrOfMax = new int[lengthOfWindow];
        int countOfMax = 1;

        for (int i = 0; i < lengthOfWindow; i++) {
            int max = nums[i];
            boolean bruteForce = i == 0; // Для нулевого окна

            if (!bruteForce) {
                if (nums[i + k - 1] > arrOfMax[i - 1]) {// Если прибывший (т.е. справа) больше максимального в предыдущем окне
                    countOfMax = 1;
                    arrOfMax[i] = nums[i + k - 1];
                    continue;
                } else if (nums[i + k - 1] == arrOfMax[i - 1]) {
                    countOfMax++;
                    arrOfMax[i] = nums[i + k - 1];
                    continue; // bruteForce = false;
                }
            }

            if (!bruteForce) {
                if (nums[i - 1] == arrOfMax[i - 1]) { // Если выбывший (т.е. слева) один из максимального в предыдущем окне
                    // Уменьшаем счетчик максимальных
                    countOfMax--;
                }
            }

            if (!bruteForce) {
                bruteForce = countOfMax <= 0;
            }

            if ( !bruteForce) {
                // Тогда максимум текущего окна совпадает с максимумом предыдущего окна
                arrOfMax[i] = arrOfMax[i - 1];
            } else {
                // Иначе ищем максимум полным перебором
                for (int j = 1; j < k; j++) {
                    if (nums[i + j] == max) {
                        countOfMax++;
                    } else if (nums[i + j] > max) {
                        max = nums[i + j];
                        countOfMax = 1;
                    }
                }

                arrOfMax[i] = max;
            }
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