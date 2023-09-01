package com.leetcode.t0007_RemoveElement;

class Solution {
    public static int removeElement(int[] nums, int val) {
        int result = nums.length;

        end:
        for (int i = 0, j = nums.length - 1; i <= j; i++) {
            if( nums[i] == val) {
                while (nums[j] == val) {
                    result--;
                    nums[j--] = 0;
                    if ( j < i) {
                        break end;
                    }
                }
                nums[i] = nums[j];
                result--;
                nums[j--] = 0;
                if ( j <= i) {
                    break;
                }
            }
        }

        return result;
    }
}