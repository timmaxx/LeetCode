package com.leetcode.t0006_SlidingWindowMaximum;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {

        int[] arrOfInt1In = {1};
        int[] arrOfInt1Out = {1};
        assertArrayEquals( arrOfInt1Out,  Solution.maxSlidingWindow( arrOfInt1In, 1));


        int[] arrOfInt2In = { 1, 3, -1, -3, 5, 3, 6, 7};
        int[] arrOfInt2Out = { 3, 3, 5, 5, 6, 7};
        assertArrayEquals( arrOfInt2Out,  Solution.maxSlidingWindow( arrOfInt2In, 3));


        int[] arrOfInt3In = { 9, 10, 9, -7, -4, -8, 2, -6};
        int[] arrOfInt3Out = { 10, 10, 9, 2};
        assertArrayEquals( arrOfInt3Out,  Solution.maxSlidingWindow( arrOfInt3In, 5));
    }
}