package fr.kata;

import org.junit.jupiter.api.Test;

import static fr.kata.StringCalculator.sum;
import static org.assertj.core.api.Assertions.assertThat;

class StringCalculatorTest {

    @Test
    void shouldSumToZeroFromNullNumbers() {
        assertThat(sum(null)).isEqualTo("0");
    }

    @Test
    void shouldSumToZeroFromEmptyNumbers() {
        assertThat(sum("")).isEqualTo("0");
    }

    @Test
    void shouldSumToFourFromFour() {
        assertThat(sum("4")).isEqualTo("4");
    }

    @Test
    void shouldSumFourAndTwo() {
        assertThat(sum("4,2")).isEqualTo("6");
    }

    @Test
    void shouldSumOneZeroOneAndTwoZeroTwo() {
        assertThat(sum("1.01,2.02")).isEqualTo("3.03");
    }

    @Test
    void shouldUseNewlinesAsSeparator() {
        assertThat(sum("1\n2,3")).isEqualTo("6");
    }
}