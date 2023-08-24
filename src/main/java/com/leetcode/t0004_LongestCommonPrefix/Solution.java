package com.leetcode.t0004_LongestCommonPrefix;

/* 14. Longest Common Prefix
Easy
15.4K
4.2K
Companies
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".


Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:
1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
*/

public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        br:
        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() == i) {
                    break br;
                }
                if (currentChar != strs[j].charAt(i)) {
                    break br;
                }
            }
            result.append(currentChar);
        }
        return result.toString();
    }
}
