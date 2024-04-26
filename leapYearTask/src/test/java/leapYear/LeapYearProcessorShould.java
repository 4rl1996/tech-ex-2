package leapYear;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearProcessorShould {

//    Високосным является год, номер которого делится на 4, но не делится на 100
//    или же номер которого делится на 400

    @Test
    void returnTrueFor2024() {
        int year = 2024;
        final var leapYearProcessor = new LeapYearProcessor();
        Boolean result = leapYearProcessor.isLeapYear(year);
        assertTrue(result);
    }

    @Test
    void returnTrueFor2000() {
        int year = 2000;
        final var leapYearProcessor = new LeapYearProcessor();
        Boolean result = leapYearProcessor.isLeapYear(year);
        assertTrue(result);
    }

    @Test
    void returnFalseFor2100() {
        int year = 2100;
        final var leapYearProcessor = new LeapYearProcessor();
        Boolean result = leapYearProcessor.isLeapYear(year);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {100, 500, 1000, 1500, 1700, 1800, 1900, 2100, 2200, 2300})
    void returnFalseFor(int year) {;
        final var leapYearProcessor = new LeapYearProcessor();
        Boolean result = leapYearProcessor.isLeapYear(year);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {1200, 1600, 2000})
    void returnTrueFor(int year) {;
        final var leapYearProcessor = new LeapYearProcessor();
        Boolean result = leapYearProcessor.isLeapYear(year);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {32, 44, 1612, 1812, 2032, 7628})
    void alsoReturnTrueFor(int year) {;
        final var leapYearProcessor = new LeapYearProcessor();
        Boolean result = leapYearProcessor.isLeapYear(year);
        assertTrue(result);
    }
}
