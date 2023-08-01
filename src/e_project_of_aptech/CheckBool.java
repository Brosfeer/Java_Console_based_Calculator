
package e_project_of_aptech;


public class CheckBool {
    
    /**
     *
     * This method takes an integer as input and checks if it is a palindrome
     * number or not.
     *
     * @return true if the number is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(int num) {
        int reversed = 0;
        int original = num;
// Reverse the number by extracting its digits one by one and adding them in reverse order.
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
// Compare the original number with the reversed number to check if it is a palindrome.
        return original == reversed;
    }
     /**
     * Checks if a given number is an Armstrong number.
     *
     * @param number The number to be checked.
     * @return True if the number is an Armstrong number, false otherwise.
     */
    public static boolean isArmstrong(double number) {
        double sum = 0;
        double originalNumber = number;
        double numberOfDigits = String.valueOf(number).length();

        // Calculate the sum of digits raised to the power of the number of digits
        while (number > 0) {
            double digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        // Check if the sum is equal to the original number
        return sum == originalNumber;
    }

    /**
     * Checks if a given number is prime.
     *
     * @param number The number to be checked.
     * @return True if the number is prime, false otherwise.
     */
    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false; // If the number is divisible by any number between 2 and itself, it is not prime.
            }
        }
        return true; // If the loop completes without finding any divisors, the number is prime.
    }

    /**
     * Finds the greatest common divisor (GCD) of two numbers.
     *
     *
     * @return The greatest common divisor of num1 and num2.
     */
    public static double findGCD(double num1, double num2) {
        while (num2 != 0) {
            double temp = num2; // @param num1 The first number.
            num2 = num1 % num2; // @param num2 The second number.
            num1 = temp;
        }
        return num1;
    }


    
}
