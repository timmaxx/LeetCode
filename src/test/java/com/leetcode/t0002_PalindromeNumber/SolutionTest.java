package com.leetcode.t0002_PalindromeNumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        assertEquals(true,  Solution.isPalindrome(121));
        assertEquals(false, Solution.isPalindrome(-121));
        assertEquals(false, Solution.isPalindrome(10));
    }
}
