package com.leetcode.t0004_LongestCommonPrefix;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        String[] strs1 = {"flower","flow","flight"};
        assertEquals("fl",  Solution.longestCommonPrefix(strs1));

        String[] strs2 = {"dog","racecar","car"};
        assertEquals("",  Solution.longestCommonPrefix(strs2));
    }
}
