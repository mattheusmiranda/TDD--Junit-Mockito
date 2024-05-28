package br.com.miranda.math;

import br.com.miranda.SimpleMath;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathTest {

    // test(Sustem Under Test)_(Condition or State Change)_(Expected Result)
    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSum() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2;
        double secondNumber = 2D;
        Double actual = math.sum(firstNumber, secondNumber);
        double expected = 8.2D;

        assertEquals(expected, actual, () -> firstNumber + "+" + secondNumber + " did not produce " + expected);
        assertNotEquals(9.2, actual);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Test 10.0 - 2.0 = 8.0")
    void testSubtraction() {
        SimpleMath math = new SimpleMath();
        Double firstNumber = 10.0;
        Double secondNumber = 2.0;
        Double actual = math.subtraction(firstNumber, secondNumber);
        double expected = 8.0;

        assertEquals(expected, actual, () -> firstNumber + "-" + secondNumber + " did not produce " + expected);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Test 2.0 * 3.0 = 6.0")
    void testMultiplication() {
        SimpleMath math = new SimpleMath();
        Double firstNumber = 2.0;
        Double secondNumber = 3.0;
        Double actual = math.multiplication(firstNumber, secondNumber);
        double expected = 6.0;

        assertEquals(expected, actual, () -> firstNumber + "*" + secondNumber + " did not produce " + expected);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Test 10.0 / 2.0 = 5.0")
    void testDivision() {
        SimpleMath math = new SimpleMath();
        Double firstNumber = 10.0;
        Double secondNumber = 2.0;
        Double actual = math.division(firstNumber, secondNumber);
        double expected = 5.0;

        assertEquals(expected, actual, () -> firstNumber + "/" + secondNumber + " did not produce " + expected);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Test Mean of 10.0 and 2.0 = 6.0")
    void testMean() {
        SimpleMath math = new SimpleMath();
        Double firstNumber = 10.0;
        Double secondNumber = 2.0;
        Double actual = math.mean(firstNumber, secondNumber);
        double expected = 6.0;

        assertEquals(expected, actual, () -> "(" + firstNumber + "+" + secondNumber + ") / 2" + " did not produce " + expected);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Test Square Root of 49.0 = 7.0")
    void testSquareRoot() {
        SimpleMath math = new SimpleMath();
        Double numberParam = 49.0;
        Double actual = math.squareRoot(numberParam);
        double expected = 7.0;

        assertEquals(expected, actual, () -> "square root of " + numberParam + " did not produce " + expected);
        assertNotNull(actual);
    }

}
