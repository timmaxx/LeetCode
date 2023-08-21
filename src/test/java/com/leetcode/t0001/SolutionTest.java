package com.leetcode.t0001;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

// Массивы в Java: создаём, заполняем, применяем
// https://skillbox.ru/media/base/massivy_v_java_sozdayem_zapolnyaem_ispolzuem/
public class SolutionTest {
    @Test
    public void test() {

        assertArrayEquals(
                new int [] {0, 1},
                Solution.twoSum(new int [] {2, 7, 11, 15}, 9)
        );

        assertArrayEquals(
                new int [] {1, 2},
                Solution.twoSum(new int [] {3, 2, 4}, 6)
        );

        assertArrayEquals(
                new int [] {0, 1},
                Solution.twoSum(new int [] {3, 3}, 6)
        );
    }
}
