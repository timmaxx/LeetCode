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
    }
}