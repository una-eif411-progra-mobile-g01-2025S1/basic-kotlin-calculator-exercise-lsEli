package basic

import org.example.basic.Calculator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

/**
 * UNIT TESTING: CALCULATOR
 *
 * Purpose:
 * This test class demonstrates the proper operation of a Calculator.
 *
 * @author Elías Mora
 * @version 1.0
 * @see Calculator
 */
@DisplayName("Basic Calculator Test")
class CalculatorTest {
    private lateinit var calculator: Calculator

    @BeforeEach
    fun setUp() {
        calculator = Calculator()
    }

    /**
     * Unit test to verify the sum of two positive numbers.
     */
    @Test
    fun testAdditionPositiveNumbers() {
        // Arrange
        val a = 1.0
        val b = 1.0
        val expectedOutput = 2.0

        // Act
        val output = calculator.add(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The sum of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the sum of two negative numbers.
     */
    @Test
    fun testAdditionNegativeNumbers() {
        // Arrange
        val a = -1.0
        val b = -1.0
        val expectedOutput = -2.0

        // Act
        val output = calculator.add(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The sum of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the sum of a positive and a negative number.
     */
    @Test
    fun testAdditionPositiveAndNegativeNumbers() {
        // Arrange
        val a = 1.0
        val b = -1.0
        val expectedOutput = 0.0

        // Act
        val output = calculator.add(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The sum of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the sum of two zeros.
     */
    @Test
    fun testAdditionWithZeros() {
        // Arrange
        val a = 0.0
        val b = 0.0
        val expectedOutput = 0.0

        // Act
        val output = calculator.add(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The sum of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the sum of two large positive numbers.
     */
    @Test
    fun testAdditionLargePositiveNumbers() {
        // Arrange
        val a = Double.MAX_VALUE
        val b = Double.MAX_VALUE
        val expectedOutput = Double.POSITIVE_INFINITY

        // Act
        val output = calculator.add(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The sum of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the sum of two large negative numbers.
     */
    @Test
    fun testAdditionLargeNegativeNumbers() {
        // Arrange
        val a = 1E-324
        val b = 1E-324
        val expectedOutput = 0.0

        // Act
        val output = calculator.add(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The sum of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the sum of a positive number and NaN.
     */
    @Test
    fun testAdditionWithNaN() {
        // Arrange
        val a = 1.0
        val b = Double.NaN
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.add(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The sum of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the sum of a positive number and positive infinity.
     */
    @Test
    fun testAdditionWithPositiveInfinity() {
        // Arrange
        val a = 1.0
        val b = Double.POSITIVE_INFINITY
        val expectedOutput = Double.POSITIVE_INFINITY

        // Act
        val output = calculator.add(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The sum of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the sum of a positive number and negative infinity.
     */
    @Test
    fun testAdditionWithNegativeInfinity() {
        // Arrange
        val a = 1.0
        val b = Double.NEGATIVE_INFINITY
        val expectedOutput = Double.NEGATIVE_INFINITY

        // Act
        val output = calculator.add(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The sum of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the sum of NaNs.
     */
    @Test
    fun testAdditionNaNs() {
        // Arrange
        val a = Double.NaN
        val b = Double.NaN
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.add(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The sum of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the sum of NaN and positive infinity.
     */
    @Test
    fun testAdditionNaNAndPositiveInfinity() {
        // Arrange
        val a = Double.NaN
        val b = Double.POSITIVE_INFINITY
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.add(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The sum of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the sum of NaN and negative infinity.
     */
    @Test
    fun testAdditionNaNAndNegativeInfinity() {
        // Arrange
        val a = Double.NaN
        val b = Double.NEGATIVE_INFINITY
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.add(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The sum of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the sum of positive infinity and negative infinity.
     */
    @Test
    fun testAdditionPositiveInfinityAndNegativeInfinity() {
        // Arrange
        val a = Double.POSITIVE_INFINITY
        val b = Double.NEGATIVE_INFINITY
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.add(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The sum of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the sum of positive infinity and positive infinity.
     */
    @Test
    fun testAdditionPositiveInfinityAndPositiveInfinity() {
        // Arrange
        val a = Double.POSITIVE_INFINITY
        val b = Double.POSITIVE_INFINITY
        val expectedOutput = Double.POSITIVE_INFINITY

        // Act
        val output = calculator.add(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The sum of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the sum of negative infinity and negative infinity.
     */
    @Test
    fun testAdditionNegativeInfinityAndNegativeInfinity() {
        // Arrange
        val a = Double.NEGATIVE_INFINITY
        val b = Double.NEGATIVE_INFINITY
        val expectedOutput = Double.NEGATIVE_INFINITY

        // Act
        val output = calculator.add(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The sum of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the subtraction of two positive numbers.
     */
    @Test
    fun testSubtractionPositiveNumbers() {
        // Arrange
        val a = 1.0
        val b = 1.0
        val expectedOutput = 0.0

        // Act
        val output = calculator.subtract(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The subtraction of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the subtraction of two negative numbers.
     */
    @Test
    fun testSubtractionNegativeNumbers() {
        // Arrange
        val a = -1.0
        val b = -1.0
        val expectedOutput = 0.0

        // Act
        val output = calculator.subtract(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The subtraction of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the subtraction of a positive and a negative number.
     */
    @Test
    fun testSubtractionPositiveAndNegativeNumbers() {
        // Arrange
        val a = 1.0
        val b = -1.0
        val expectedOutput = 2.0

        // Act
        val output = calculator.subtract(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The subtraction of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the subtraction of two zeros.
     */
    @Test
    fun testSubtractionWithZeros() {
        // Arrange
        val a = 0.0
        val b = 0.0
        val expectedOutput = 0.0

        // Act
        val output = calculator.subtract(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The subtraction of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the subtraction of two large positive numbers.
     */
    @Test
    fun testSubtractionLargePositiveNumbers() {
        // Arrange
        val a = Double.MAX_VALUE
        val b = Double.MAX_VALUE
        val expectedOutput = 0.0

        // Act
        val output = calculator.subtract(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The subtraction of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the subtraction of two large negative numbers.
     */
    @Test
    fun testSubtractionLargeNegativeNumbers() {
        // Arrange
        val a = Double.MIN_VALUE
        val b = Double.MIN_VALUE
        val expectedOutput = 0.0

        // Act
        val output = calculator.subtract(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The subtraction of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the subtraction of a positive number and NaN.
     */
    @Test
    fun testSubtractionWithNaN() {
        // Arrange
        val a = 1.0
        val b = Double.NaN
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.subtract(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The subtraction of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the subtraction of a positive number and positive infinity.
     */
    @Test
    fun testSubtractionWithPositiveInfinity() {
        // Arrange
        val a = 1.0
        val b = Double.POSITIVE_INFINITY
        val expectedOutput = Double.NEGATIVE_INFINITY

        // Act
        val output = calculator.subtract(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The subtraction of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the subtraction of a positive number and negative infinity.
     */
    @Test
    fun testSubtractionWithNegativeInfinity() {
        // Arrange
        val a = 1.0
        val b = Double.NEGATIVE_INFINITY
        val expectedOutput = Double.POSITIVE_INFINITY

        // Act
        val output = calculator.subtract(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The subtraction of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the subtraction of NaNs.
     */
    @Test
    fun testSubtractionNaNs() {
        // Arrange
        val a = Double.NaN
        val b = Double.NaN
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.subtract(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The subtraction of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the subtraction of NaN and positive infinity.
     */
    @Test
    fun testSubtractionNaNAndPositiveInfinity() {
        // Arrange
        val a = Double.NaN
        val b = Double.POSITIVE_INFINITY
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.subtract(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The subtraction of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the subtraction of NaN and negative infinity.
     */
    @Test
    fun testSubtractionNaNAndNegativeInfinity() {
        // Arrange
        val a = Double.NaN
        val b = Double.NEGATIVE_INFINITY
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.subtract(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The subtraction of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the subtraction of positive infinity and negative infinity.
     */
    @Test
    fun testSubtractionPositiveInfinityAndNegativeInfinity() {
        // Arrange
        val a = Double.POSITIVE_INFINITY
        val b = Double.NEGATIVE_INFINITY
        val expectedOutput = Double.POSITIVE_INFINITY

        // Act
        val output = calculator.subtract(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The subtraction of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the subtraction of positive infinity and positive infinity.
     */
    @Test
    fun testSubtractionPositiveInfinityAndPositiveInfinity() {
        // Arrange
        val a = Double.POSITIVE_INFINITY
        val b = Double.POSITIVE_INFINITY
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.subtract(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The subtraction of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the subtraction of negative infinity and negative infinity.
     */
    @Test
    fun testSubtractionNegativeInfinityAndNegativeInfinity() {
        // Arrange
        val a = Double.NEGATIVE_INFINITY
        val b = Double.NEGATIVE_INFINITY
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.subtract(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The subtraction of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the multiplication of two positive numbers.
     */
    @Test
    fun testMultiplicationPositiveNumbers() {
        // Arrange
        val a = 1.0
        val b = 1.0
        val expectedOutput = 1.0

        // Act
        val output = calculator.multiply(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The multiplication of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the multiplication of two negative numbers.
     */
    @Test
    fun testMultiplicationNegativeNumbers() {
        // Arrange
        val a = -1.0
        val b = -1.0
        val expectedOutput = 1.0

        // Act
        val output = calculator.multiply(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The multiplication of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the multiplication of a positive and a negative number.
     */
    @Test
    fun testMultiplicationPositiveAndNegativeNumbers() {
        // Arrange
        val a = 1.0
        val b = -1.0
        val expectedOutput = -1.0

        // Act
        val output = calculator.multiply(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The multiplication of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the multiplication of two zeros.
     */
    @Test
    fun testMultiplicationWithZeros() {
        // Arrange
        val a = 0.0
        val b = 0.0
        val expectedOutput = 0.0

        // Act
        val output = calculator.multiply(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The multiplication of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the multiplication of two large positive numbers.
     */
    @Test
    fun testMultiplicationLargePositiveNumbers() {
        // Arrange
        val a = Double.MAX_VALUE
        val b = Double.MAX_VALUE
        val expectedOutput = Double.POSITIVE_INFINITY

        // Act
        val output = calculator.multiply(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The multiplication of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the multiplication of two large negative numbers.
     */
    @Test
    fun testMultiplicationLargeNegativeNumbers() {
        // Arrange
        val a = Double.MIN_VALUE
        val b = Double.MIN_VALUE
        val expectedOutput = 0.0

        // Act
        val output = calculator.multiply(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The multiplication of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the multiplication of a positive number and NaN.
     */
    @Test
    fun testMultiplicationWithNaN() {
        // Arrange
        val a = 1.0
        val b = Double.NaN
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.multiply(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The multiplication of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the multiplication of a positive number and positive infinity.
     */
    @Test
    fun testMultiplicationWithPositiveInfinity() {
        // Arrange
        val a = 1.0
        val b = Double.POSITIVE_INFINITY
        val expectedOutput = Double.POSITIVE_INFINITY

        // Act
        val output = calculator.multiply(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The multiplication of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the multiplication of a positive number and negative infinity.
     */
    @Test
    fun testMultiplicationWithNegativeInfinity() {
        // Arrange
        val a = 1.0
        val b = Double.NEGATIVE_INFINITY
        val expectedOutput = Double.NEGATIVE_INFINITY

        // Act
        val output = calculator.multiply(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The multiplication of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the multiplication of NaNs.
     */
    @Test
    fun testMultiplicationNaNs() {
        // Arrange
        val a = Double.NaN
        val b = Double.NaN
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.multiply(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The multiplication of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the multiplication of NaN and positive infinity.
     */
    @Test
    fun testMultiplicationNaNAndPositiveInfinity() {
        // Arrange
        val a = Double.NaN
        val b = Double.POSITIVE_INFINITY
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.multiply(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The multiplication of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the multiplication of NaN and negative infinity.
     */
    @Test
    fun testMultiplicationNaNAndNegativeInfinity() {
        // Arrange
        val a = Double.NaN
        val b = Double.NEGATIVE_INFINITY
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.multiply(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The multiplication of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the multiplication of positive infinity and negative infinity.
     */
    @Test
    fun testMultiplicationPositiveInfinityAndNegativeInfinity() {
        // Arrange
        val a = Double.POSITIVE_INFINITY
        val b = Double.NEGATIVE_INFINITY
        val expectedOutput = Double.NEGATIVE_INFINITY

        // Act
        val output = calculator.multiply(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The multiplication of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the multiplication of positive infinity and positive infinity.
     */
    @Test
    fun testMultiplicationPositiveInfinityAndPositiveInfinity() {
        // Arrange
        val a = Double.POSITIVE_INFINITY
        val b = Double.POSITIVE_INFINITY
        val expectedOutput = Double.POSITIVE_INFINITY

        // Act
        val output = calculator.multiply(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The multiplication of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the multiplication of negative infinity and negative infinity.
     */
    @Test
    fun testMultiplicationNegativeInfinityAndNegativeInfinity() {
        // Arrange
        val a = Double.NEGATIVE_INFINITY
        val b = Double.NEGATIVE_INFINITY
        val expectedOutput = Double.POSITIVE_INFINITY

        // Act
        val output = calculator.multiply(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The multiplication of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the division of two positive numbers.
     */
    @Test
    fun testDivisionPositiveNumbers() {
        // Arrange
        val a = 1.0
        val b = 1.0
        val expectedOutput = 1.0

        // Act
        val output = calculator.divide(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The division of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the division of two negative numbers.
     */
    @Test
    fun testDivisionNegativeNumbers() {
        // Arrange
        val a = -1.0
        val b = -1.0
        val expectedOutput = 1.0

        // Act
        val output = calculator.divide(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The division of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the division of a positive and a negative number.
     */
    @Test
    fun testDivisionPositiveAndNegativeNumbers() {
        // Arrange
        val a = 1.0
        val b = -1.0
        val expectedOutput = -1.0

        // Act
        val output = calculator.divide(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The division of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the division of zero dividend and a positive divisor.
     */
    @Test
    fun testDivisionByZeroDividend() {
        // Arrange
        val a = 0.0
        val b = 2.0
        val expectedOutput = 0.0

        // Act
        val output = calculator.divide(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The division of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the division of a positive dividend and zero divisor.
     */
    @Test
    fun testDivisionByZeroDivisor() {
        // Arrange
        val a = 2.0
        val b = 0.0
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.divide(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The division of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the division of two zeros.
     */
    @Test
    fun testDivisionWithZeros() {
        // Arrange
        val a = 0.0
        val b = 0.0
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.divide(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The division of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the division of NaN dividend and a positive divisor.
     */
    @Test
    fun testDivisionWithNaNDividend() {
        // Arrange
        val a = Double.NaN
        val b = 1.0
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.divide(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The division of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the division of a positive dividend and NaN divisor.
     */
    @Test
    fun testDivisionWithNaNDivisor() {
        // Arrange
        val a = 1.0
        val b = Double.NaN
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.divide(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The division of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the division of a positive dividend and positive infinity divisor.
     */
    @Test
    fun testDivisionWithPositiveInfinityDividend() {
        // Arrange
        val a = Double.POSITIVE_INFINITY
        val b = 1.0
        val expectedOutput = Double.POSITIVE_INFINITY

        // Act
        val output = calculator.divide(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The division of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the division of a positive dividend and positive infinity divisor.
     */
    @Test
    fun testDivisionWithPositiveInfinityDivisor() {
        // Arrange
        val a = 1.0
        val b = Double.POSITIVE_INFINITY
        val expectedOutput = 0.0

        // Act
        val output = calculator.divide(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The division of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the division of a negative infinity dividend and a positive divisor.
     */
    @Test
    fun testDivisionWithNegativeInfinityDividend() {
        // Arrange
        val a = Double.NEGATIVE_INFINITY
        val b = 1.0
        val expectedOutput = Double.NEGATIVE_INFINITY

        // Act
        val output = calculator.divide(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The division of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the division of a positive dividend and negative infinity divisor.
     */
    @Test
    fun testDivisionWithNegativeInfinityDivisor() {
        // Arrange
        val a = 1.0
        val b = Double.NEGATIVE_INFINITY
        val expectedOutput = -0.0

        // Act
        val output = calculator.divide(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The division of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the division of positive infinity dividend and a positive infinity divisor.
     */
    @Test
    fun testDivisionWithPositiveInfinityDividendAndDivisor() {
        // Arrange
        val a = Double.POSITIVE_INFINITY
        val b = Double.POSITIVE_INFINITY
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.divide(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The division of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the division of negative infinity dividend and a negative infinity divisor.
     */
    @Test
    fun testDivisionWithNegativeInfinityDividendAndDivisor() {
        // Arrange
        val a = Double.NEGATIVE_INFINITY
        val b = Double.NEGATIVE_INFINITY
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.divide(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The division of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the division of two large positive numbers.
     */
    @Test
    fun testDivisionWithPositiveInfinityDividendAndNegativeInfinityDivisor() {
        // Arrange
        val a = Double.POSITIVE_INFINITY
        val b = Double.NEGATIVE_INFINITY
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.divide(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The division of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the division of two large positive numbers.
     */
    @Test
    fun testDivisionWithNegativeInfinityDividendAndPositiveInfinityDivisor() {
        // Arrange
        val a = Double.NEGATIVE_INFINITY
        val b = Double.POSITIVE_INFINITY
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.divide(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The division of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the division of two large positive numbers.
     */
    @Test
    fun testDivisionWithPositiveInfinityDividendAndNaNDivisor() {
        // Arrange
        val a = Double.POSITIVE_INFINITY
        val b = Double.NaN
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.divide(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The division of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the division of two large positive numbers.
     */
    @Test
    fun testDivisionWithNegativeInfinityDividendAndNaNDivisor() {
        // Arrange
        val a = Double.NEGATIVE_INFINITY
        val b = Double.NaN
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.divide(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The division of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the division of two large positive numbers.
     */
    @Test
    fun testDivisionWithNaNDividendAndPositiveInfinityDivisor() {
        // Arrange
        val a = Double.NaN
        val b = Double.POSITIVE_INFINITY
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.divide(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The division of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the division of two large positive numbers.
     */
    @Test
    fun testDivisionWithNaNDividendAndNegativeInfinityDivisor() {
        // Arrange
        val a = Double.NaN
        val b = Double.NEGATIVE_INFINITY
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.divide(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The division of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the division of two large positive numbers.
     */
    @Test
    fun testDivisionWithNaNDividendAndNaNDivisor() {
        // Arrange
        val a = Double.NaN
        val b = Double.NaN
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.divide(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The division of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the division of two large positive numbers.
     */
    @Test
    fun testDivisionWithPositiveInfinityDividendAndPositiveInfinityDivisor() {
        // Arrange
        val a = Double.POSITIVE_INFINITY
        val b = Double.POSITIVE_INFINITY
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.divide(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The division of $a and $b should be $expectedOutput")
    }

    /**
     * Unit test to verify the division of two large positive numbers.
     */
    @Test
    fun testDivisionWithNegativeInfinityDividendAndNegativeInfinityDivisor() {
        // Arrange
        val a = Double.NEGATIVE_INFINITY
        val b = Double.NEGATIVE_INFINITY
        val expectedOutput = Double.NaN

        // Act
        val output = calculator.divide(a, b)

        // Assert
        assertEquals(expectedOutput, output, "The division of $a and $b should be $expectedOutput")
    }

}