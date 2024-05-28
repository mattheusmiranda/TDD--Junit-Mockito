package br.com.miranda.math;

import br.com.miranda.SimpleMath;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathTest {

    SimpleMath math;

    @BeforeAll
    static void setup() {
        System.out.println("Running @BeforeAll method!");
    }

    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
    }

    @AfterEach
    void afterEachMethod() {
        System.out.println("Running @AfterEach method!");
    }

    @AfterAll
    static void cleanup() {
        System.out.println("Running @AfterAll method!");
    }

    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSum() {

        // AAA

        // Given - Arange
        double firstNumber = 6.2;
        double secondNumber = 2D;
        double expected = 8.2D;

        // When - Act
        Double actual = math.sum(firstNumber, secondNumber);

        // Then - Assert
        assertEquals(expected, actual, () -> firstNumber + "+" + secondNumber + " did not produce " + expected);
        assertNotEquals(9.2, actual);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Test 10.0 - 2.0 = 8.0")
    void testSubtraction() {
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
        Double numberParam = 49.0;
        Double actual = math.squareRoot(numberParam);
        double expected = 7.0;

        assertEquals(expected, actual, () -> "square root of " + numberParam + " did not produce " + expected);
        assertNotNull(actual);
    }
}
