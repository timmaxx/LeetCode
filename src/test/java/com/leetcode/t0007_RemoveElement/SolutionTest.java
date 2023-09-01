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

    @Test
    public void test3() {
        int[] arrOfIntIn = { 1};
        int valIn = 1;
        int valOut = 0;
        int[] arrOfIntOut = { 0};

        assertEquals( valOut, Solution.removeElement( arrOfIntIn, valIn));
        assertArrayEquals( arrOfIntOut, arrOfIntIn);
    }

    @Test
    public void test4() {
        int[] arrOfIntIn = { 2, 0, 4};
        int valIn = 0;
        int valOut = 2;
        int[] arrOfIntOut = { 2, 4, 0};

        assertEquals( valOut, Solution.removeElement( arrOfIntIn, valIn));
        assertArrayEquals( arrOfIntOut, arrOfIntIn);
    }

    @Test
    public void test5() {
        int[] arrOfIntIn = { 3, 3};
        int valIn = 3;
        int valOut = 0;
        int[] arrOfIntOut = { 0, 0};

        assertEquals( valOut, Solution.removeElement( arrOfIntIn, valIn));
        assertArrayEquals( arrOfIntOut, arrOfIntIn);
    }

    @Test
    public void test6() {
        int[] arrOfIntIn = { 0, 2, 1, 2, 1};
        int valIn = 0;
        int valOut = 4;
        int[] arrOfIntOut = { 1, 2, 1, 2, 0};

        assertEquals( valOut, Solution.removeElement( arrOfIntIn, valIn));
        assertArrayEquals( arrOfIntOut, arrOfIntIn);
    }

}