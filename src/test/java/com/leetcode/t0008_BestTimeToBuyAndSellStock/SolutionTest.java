package com.leetcode.t0008_BestTimeToBuyAndSellStock;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test1() {
        int[] arrOfIntIn = { 7, 1, 5, 3, 6, 4};
        int valOut = 5;
        assertEquals( valOut, Solution.maxProfit( arrOfIntIn));
    }

    @Test
    public void test2() {
        int[] arrOfIntIn = { 7, 6, 4, 3, 1};
        int valOut = 0;
        assertEquals( valOut, Solution.maxProfit( arrOfIntIn));
    }
}