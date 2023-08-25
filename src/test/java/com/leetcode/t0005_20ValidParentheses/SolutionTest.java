package com.leetcode.t0005_20ValidParentheses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SolutionTest {
    @ParameterizedTest(name = "s = {1}")
    @CsvSource(textBlock = """
                 true,    ()
                 true,    ()[]{}
                false,    (]
                false,    ()]
                false,    (((
                false,    ({[}])
                 true,    ({[]})
        """)
    @DisplayName("Sample tests")
    void sampleTests(Boolean expected, String s) {
        Assertions.assertEquals(expected, Solution.isValid(s));
    }
}