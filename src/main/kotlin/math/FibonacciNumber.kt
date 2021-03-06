package math

/**
 * This is an algorithm to find a fibonacciNumber
 *
 * Worst-case performance	O(n)
 * Best-case performance	O(1)
 * Average performance	O(n)
 * Worst-case space complexity	O(1)
 */

/**
 * @param n the number you are looking for its fibonacciNumber
 * @return the fibonacciNumber
 */
fun <T : Comparable<T>> fibonacci(n: Long): Long {
    if (n <= 1) {
        return 1
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2)
    }
}