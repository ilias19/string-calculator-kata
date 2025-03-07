package fr.kata;

import java.math.BigDecimal;
import java.util.Arrays;

public class StringCalculator {
    private static final String SEPARATOR = ",|\n";

    private StringCalculator() {}

    public static String sum(String numbers) {
        if (noNumbers(numbers)) {
            return "0";
        }

        return Arrays.stream(numbers.split(SEPARATOR)).map(BigDecimal::new).reduce(BigDecimal.ZERO, BigDecimal::add).toPlainString();
    }

    private static boolean noNumbers(String numbers) {
        return numbers == null || numbers.isBlank();
    }

}
