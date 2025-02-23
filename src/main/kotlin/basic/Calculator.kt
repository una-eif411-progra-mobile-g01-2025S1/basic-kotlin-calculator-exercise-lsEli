package org.example.basic

/**
 * CALCULATOR
 *
 * Purpose:
 * This class implements the basic arithmetic operations of a Calculator.
 *
 * @author Elías Mora
 * @version 1.0
 * @see Calculator
 */
class Calculator {

    /**
     * Add two numbers.
     * @param a First number to add.
     * @param b Second number to add.
     * @return The sum of `a` and `b`.
     */
    fun add(a: Double, b: Double): Double {
        return a + b
    }

    /**
     * Subtract two numbers.
     * @param a First number to subtract.
     * @param b Second number to subtract.
     * @return The difference of `a` and `b`.s
     */
    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

    /**
     * Multiplies two numbers.
     * @param a First number to multiply.
     * @param b Second number to multiply.
     * @return The product of `a` and `b`.
     */
    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    /**
     * Divide `a` by `b` handling division by zero.
     * @return Return NaN if `b` is 0.0 to avoid division errors.
     * @param a Dividend.
     * @param b Divisor.
     * @return The result of `a` divided by `b`.
     */
    fun divide(a: Double, b: Double): Double {
        return when {
            (0.0 == b) -> Double.NaN
            (0.0 == a) -> a

            else -> a / b
        }
    }
}