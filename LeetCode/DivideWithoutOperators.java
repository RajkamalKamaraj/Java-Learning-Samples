package LeetCode;

public class DivideWithoutOperators  {

        public static int divide(int dividend, int divisor) {
            // Handling edge case where divisor is 0.
            if (divisor == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }

            // Handle overflow case (if dividend is Integer.MIN_VALUE and divisor is -1)
            if (dividend == Integer.MIN_VALUE && divisor == -1) {
                return Integer.MAX_VALUE; // This is to avoid overflow as -Integer.MIN_VALUE would be out of range
            }

            // Determine the sign of the result
            boolean negative = (dividend < 0) ^ (divisor < 0); // XOR for checking if signs are different

            // Work with positive numbers for simplicity
            long absDividend = Math.abs((long) dividend);
            long absDivisor = Math.abs((long) divisor);

            int result = 0;

            while (absDividend >= absDivisor) {
                long tempDivisor = absDivisor;
                long multiple = 1;

                // Double the divisor and multiple until it is greater than the dividend
                while (absDividend >= (tempDivisor << 1)) {
                    tempDivisor <<= 1;
                    multiple <<= 1;
                }

                // Subtract the largest possible multiple of divisor from the dividend
                absDividend -= tempDivisor;
                result += multiple;
            }

            // If the result should be negative, convert it
            return negative ? -result : result;
        }

        public static void main(String[] args) {
            int dividend = 20;
            int divisor = 3;
            int result = divide(dividend, divisor);
            System.out.println("Result of division: " + result); // Output: 3
        }
    }

