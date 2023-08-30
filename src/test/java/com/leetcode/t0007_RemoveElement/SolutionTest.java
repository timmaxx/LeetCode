package com.leetcode.t0007_RemoveElement;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test1() {
        int[] arrOfIntIn = { 3, 2, 2, 3};
        int valIn = 3;
        int valOut = 2;
        int[] arrOfIntOut = { 2, 2, 0, 0};

        assertEquals( valOut, Solution.removeElement( arrOfIntIn, valIn));
        assertArrayEquals( arrOfIntOut, arrOfIntIn);
    }

    @Test
    public void test2() {
        int[] arrOfIntIn = { 0, 1, 2, 2, 3, 0, 4, 2};
        int valIn = 2;
        int valOut = 5;
        int[] arrOfIntOut = { 0, 1, 4, 0, 3, 0, 0, 0};

        assertEquals( valOut, Solution.removeElement( arrOfIntIn, valIn));
        assertArrayEquals( arrOfIntOut, arrOfIntIn);
    }
}