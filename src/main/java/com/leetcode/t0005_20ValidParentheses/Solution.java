package com.leetcode.t0005_20ValidParentheses;

/* 20. Valid Parentheses
Easy
21.6K
1.4K
Companies
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false


Constraints:
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
*/

import java.util.Stack;

class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char chFromStr = s.charAt(i);
            if (chFromStr == '(' || chFromStr == '[' || chFromStr == '{') {
                stack.push(chFromStr);
            } else {
                if (stack.empty()) {
                    return false;
                }
                char chFromStackAnti;
                char chFromStack = stack.pop();
                if (chFromStack == '(' ) {
                    chFromStackAnti = ')';
                } else if ( chFromStack == '[' ) {
                    chFromStackAnti = ']';
                } else {
                    chFromStackAnti = '}';
                }

                if (chFromStackAnti != chFromStr) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}