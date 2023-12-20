package org.advent.day1;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.*;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CallibratorTest {

    private static Stream<Arguments> numberCheck() {
    return Stream.of(
      Arguments.of("nonumbers", 0),
      Arguments.of("only1number", 11),
      Arguments.of("not1but2numbers", 12),
      Arguments.of("not1or2but3numbers", 13),
      Arguments.of("one2three", 13),
      Arguments.of("1five7eightone", 11),
      Arguments.of("oneseveneighthree", 13)
    );
}

    @ParameterizedTest
    @MethodSource("numberCheck")
    void shouldNumbersInSequence(String sequence, int expectedOutput) {
        int result = Callibrator.digitExtractor(sequence);
        assertThat(result, equalTo(expectedOutput));
    }

    @Test
    void shouldReturnSumOfNumbersPassedIn() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int total = Callibrator.callibrationSum(numbers);
        assertThat(total, equalTo(15));
    }

    @Test
    void shouldReadInAFile() {
        Callibrator.reader("testFile.txt");
    }

    @Test
    void shouldThrowExceptionIfCantFindFile() {
        assertThrows(NullPointerException.class, () -> {
            Callibrator.reader("unknownFile.txt");
        });
    }

}
