package com.leetcode.t0003_RomanToInteger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        assertEquals(3,  com.leetcode.t0003_RomanToInteger.Solution.romanToInt("III"));
        assertEquals(58,  com.leetcode.t0003_RomanToInteger.Solution.romanToInt("LVIII"));
        assertEquals(1994,  com.leetcode.t0003_RomanToInteger.Solution.romanToInt("MCMXCIV"));
    }
}
