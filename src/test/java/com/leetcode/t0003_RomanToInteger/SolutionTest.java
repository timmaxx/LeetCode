package com.leetcode.t0003_RomanToInteger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        assertEquals(3,  Solution.romanToInt("III"));
        assertEquals(58,  Solution.romanToInt("LVIII"));
        assertEquals(1994,  Solution.romanToInt("MCMXCIV"));

        assertEquals(44,  Solution.romanToInt("XLIV"));
        assertEquals(621,  Solution.romanToInt("DCXXI"));
    }
}
